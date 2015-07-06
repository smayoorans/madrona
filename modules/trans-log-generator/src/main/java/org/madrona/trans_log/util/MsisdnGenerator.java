package org.madrona.trans_log.util;


import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MsisdnGenerator implements Supplier<String> {

    private static final String NUMBER_PATTERN = "^[0-9]{11}$";
    private static final String RANGE_PATTERN = "^[0-9]{11}-[0-9]{11}$";
    private static final String WILDCARD_PATTERN = "^[0-9]+\\*$";

    private PrimitiveIterator.OfLong iterator;

    public void init() throws IOException {
        reload();
    }

    public void reload() throws IOException {
        List<String> patternList = new ArrayList<>();
        patternList.add("63916*");
        iterator = Stream.generate(patternList::stream)
                .map(stream -> stream.flatMapToLong(this::compilePattern))
                .flatMapToLong(Function.<LongStream>identity())
                .iterator();
    }

    private LongStream compilePattern(String pattern) {
        if (pattern.matches(NUMBER_PATTERN))
            return LongStream.of(Long.parseLong(pattern));
        else if (pattern.matches(RANGE_PATTERN)) {
            return createRangeStream(pattern);
        } else if (pattern.matches(WILDCARD_PATTERN))
            return createWildcardStream(pattern);
        return LongStream.empty();
    }

    private LongStream createWildcardStream(String pattern) {
        String prefix = pattern.trim().replace("*", "");
        int wildcardLength = 11 - prefix.length();
        Long start = Long.parseLong(prefix + new String(new char[wildcardLength]).replace("\0", "0"));
        Long end = Long.parseLong(prefix + new String(new char[wildcardLength]).replace("\0", "9"));
        return LongStream.rangeClosed(start, end);
    }

    private LongStream createRangeStream(String pattern) {
        String[] parts = pattern.split("\\-");
        Long start = Long.parseLong(parts[0].trim());
        Long end = Long.parseLong(parts[1].trim());
        if (start < end) return LongStream.rangeClosed(start, end);
        else return LongStream.iterate(start, i -> i--).limit(start - end);
    }

    @Override
    public String get() {
        return String.valueOf(iterator.next());
    }

}
