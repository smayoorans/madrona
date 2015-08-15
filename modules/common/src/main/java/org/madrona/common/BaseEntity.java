package org.madrona.common;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <code>BaseEntity</code> is the base class for all persisted entity objects.
 * It provides implementation of <code>equals</code> and <code>hashCode</code>
 * to be shared by all persistent objects. It also tracks the version information across the
 * lifetime of the object
 * <p/>
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Version
    private long persisted_version;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", nullable = false)
    private Date createdTime = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_modified_time", nullable = false)
    private Date lastModifiedTime = new Date();

    @PrePersist
    protected void onCreate() {
        createdTime = lastModifiedTime = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        lastModifiedTime = new Date();
    }


    protected BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPersisted_version() {
        return persisted_version;
    }

    public void setPersisted_version(long persisted_version) {
        this.persisted_version = persisted_version;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;

        BaseEntity that = (BaseEntity) o;

        if (id != that.id) return false;
        if (persisted_version != that.persisted_version) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (int) (persisted_version ^ (persisted_version >>> 32));
        return result;
    }

    public void clearId() {
        this.id = null;
    }

    ;
}
