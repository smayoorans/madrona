<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
    <title><decorator:title default="Admin Dashboard"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <!-- Bootstrap core CSS -->
    <title><decorator:title default="Admin Dashboard"/></title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>

    <!-- Font Awesome Icons -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet"
          type="text/css"/>

    <!-- Ionicons -->
    <link href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" rel="stylesheet" type="text/css"/>

    <%-- Data tables styles--%>
    <link href="<c:url value="/resources/plugins/datatables/dataTables.bootstrap.css"/>" rel="stylesheet"
          type="text/css"/>

     <%--Sortable--%>
    <link href="<c:url value="/resources/plugins/sortable/jquery-sortable.css"/>" rel="stylesheet"
          type="text/css"/>

    <!-- daterange picker -->
    <link href="<c:url value="/resources/plugins/daterangepicker/daterangepicker-bs3.css"/>" rel="stylesheet"
          type="text/css"/>

    <!-- iCheck for checkboxes and radio inputs -->
    <link href="<c:url value="/resources/plugins/iCheck/all.css"/>" rel="stylesheet" type="text/css"/>

    <!-- Bootstrap Color Picker -->
    <link href="<c:url value="/resources/plugins/colorpicker/bootstrap-colorpicker.min.css"/>" rel="stylesheet"/>

    <!-- Bootstrap time Picker -->
    <link href="<c:url value="/resources/plugins/timepicker/bootstrap-timepicker.min.css"/>" rel="stylesheet"/>

    <!-- jvectormap -->
    <link href="<c:url value="/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css"/>" rel="stylesheet"
          type="text/css"/>

    <%--File input--%>
    <link href="<c:url value="/resources/plugins/fileinput/fileinput.css"/>" rel="stylesheet" type="text/css"/>

    <!-- Theme style -->
    <link href="<c:url value="/resources/dist/css/AdminLTE.min.css"/>" rel="stylesheet" type="text/css"/>
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link href="<c:url value="/resources/dist/css/skins/_all-skins.min.css"/>" rel="stylesheet" type="text/css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <decorator:head/>
</head>
<body class="skin-blue sidebar-mini">

<div class="wrapper">

    <%@ include file="/WEB-INF/includes/header.jsp" %>
    <!-- Left side column. contains the logo and sidebar -->
    <%@ include file="/WEB-INF/includes/side-menu.jsp" %>

    <decorator:body/>

    <%@ include file="/WEB-INF/includes/footer.jsp" %>
    <!-- Control Sidebar -->
    <%@ include file="/WEB-INF/includes/control-sidebar.jsp" %>

</div>
<!-- ./wrapper -->

<!-- jQuery 2.1.4 -->
<script src="<c:url value="/resources/plugins/jQuery/jQuery-2.1.4.min.js"/>" type="text/javascript"></script>
<!-- Bootstrap 3.3.2 JS -->
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>
<!-- FastClick -->
<script src='<c:url value="/resources/plugins/fastclick/fastclick.min.js"/>' type="text/javascript"></script>

<!-- InputMask -->
<script src="<c:url value="/resources/plugins/input-mask/jquery.inputmask.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/plugins/input-mask/jquery.inputmask.date.extensions.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/plugins/input-mask/jquery.inputmask.extensions.js"/>" type="text/javascript"></script>

<!-- date-range-picker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js" type="text/javascript"></script>
<script src="<c:url value="/resources/plugins/daterangepicker/daterangepicker.js"/>" type="text/javascript"></script>
<!-- bootstrap color picker -->
<script src="<c:url value="/resources/plugins/colorpicker/bootstrap-colorpicker.min.js"/>" type="text/javascript"></script>
<!-- bootstrap time picker -->
<script src="<c:url value="/resources/plugins/timepicker/bootstrap-timepicker.min.js"/>" type="text/javascript"></script>

<%--File Input--%>
<script src="<c:url value="/resources/plugins/fileinput/fileinput.js"/>" type="text/javascript"></script>

<%--sortable--%>
<script src="<c:url value="/resources/plugins/sortable/jquery-sortable.js"/>" type="text/javascript"></script>

<!-- DATA TABES SCRIPT -->
<script src="<c:url value="/resources/plugins/datatables/jquery.dataTables.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/plugins/datatables/dataTables.bootstrap.min.js"/>"
        type="text/javascript"></script>

<!-- Sparkline -->
<script src="<c:url value="/resources/plugins/sparkline/jquery.sparkline.min.js"/>" type="text/javascript"></script>

<!-- jvectormap -->
<script src="<c:url value="/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"/>"
        type="text/javascript"></script>
<script src="<c:url value="/resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"/>"
        type="text/javascript"></script>

<!-- SlimScroll 1.3.0 -->
<script src="<c:url value="/resources/plugins/slimScroll/jquery.slimscroll.min.js"/>" type="text/javascript"></script>

<!-- ChartJS 1.0.1 -->
<script src="<c:url value="/resources/plugins/chartjs/Chart.min.js"/>" type="text/javascript"></script>

<!-- iCheck 1.0.1 -->
<script src="<c:url value="/resources/plugins/iCheck/icheck.min.js"/>" type="text/javascript"></script>

<script src="<c:url value="/resources/dist/js/app.min.js"/>" type="text/javascript"></script>

<script type="text/javascript">
    $(function () {
        $("#example1").dataTable();
        $('#example2').dataTable({
            "bPaginate": true,
            "bLengthChange": false,
            "bFilter": false,
            "bSort": true,
            "bInfo": true,
            "bAutoWidth": false
        });
    });
</script>

<script type="text/javascript">
    $(function () {
        //Datemask dd/mm/yyyy
        $("#datemask").inputmask("dd/mm/yyyy", {"placeholder": "dd/mm/yyyy"});
        //Datemask2 mm/dd/yyyy
        $("#datemask2").inputmask("mm/dd/yyyy", {"placeholder": "mm/dd/yyyy"});
        //Money Euro
        $("[data-mask]").inputmask();

        //Date range picker
        $('#reservation').daterangepicker();
        //Date range picker with time picker
        $('#reservationtime').daterangepicker({timePicker: true, timePickerIncrement: 30, format: 'MM/DD/YYYY h:mm A'});
        //Date range as a button
        $('#daterange-btn').daterangepicker(
                {
                    ranges: {
                        'Today': [moment(), moment()],
                        'Yesterday': [moment().subtract('days', 1), moment().subtract('days', 1)],
                        'Last 7 Days': [moment().subtract('days', 6), moment()],
                        'Last 30 Days': [moment().subtract('days', 29), moment()],
                        'This Month': [moment().startOf('month'), moment().endOf('month')],
                        'Last Month': [moment().subtract('month', 1).startOf('month'), moment().subtract('month', 1).endOf('month')]
                    },
                    startDate: moment().subtract('days', 29),
                    endDate: moment()
                },
                function (start, end) {
                    $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
                }
        );

        //iCheck for checkbox and radio inputs
        $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
            checkboxClass: 'icheckbox_minimal-blue',
            radioClass: 'iradio_minimal-blue'
        });
        //Red color scheme for iCheck
        $('input[type="checkbox"].minimal-red, input[type="radio"].minimal-red').iCheck({
            checkboxClass: 'icheckbox_minimal-red',
            radioClass: 'iradio_minimal-red'
        });
        //Flat red color scheme for iCheck
        $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
            checkboxClass: 'icheckbox_flat-green',
            radioClass: 'iradio_flat-green'
        });

        //Colorpicker
        $(".my-colorpicker1").colorpicker();
        //color picker with addon
        $(".my-colorpicker2").colorpicker();

        //Timepicker
        $(".timepicker").timepicker({
            showInputs: false
        });
    });
</script>


<script type="text/javascript">
    $("#profile_picture").fileinput({
        showUpload: false,
        showCaption: false,
        browseClass: "btn btn-default",
        fileType: "any",
        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>"
    });
</script>


<script type="text/javascript">
    var adjustment;

    $("ol.simple_with_animation").sortable({
        group: 'simple_with_animation',
        pullPlaceholder: false,
        // animation on drop
        onDrop: function  ($item, container, _super) {
            var $clonedItem = $('<li/>').css({height: 0});
            $item.before($clonedItem);
            $clonedItem.animate({'height': $item.height()});

            $item.animate($clonedItem.position(), function  () {
                $clonedItem.detach();
                _super($item, container);
            });
        },

        // set $item relative to cursor position
        onDragStart: function ($item, container, _super) {
            var offset = $item.offset(),
                    pointer = container.rootGroup.pointer;

            adjustment = {
                left: pointer.left - offset.left,
                top: pointer.top - offset.top
            };

            _super($item, container);
        },
        onDrag: function ($item, position) {
            $item.css({
                left: position.left - adjustment.left,
                top: position.top - adjustment.top
            });
        }
    });
</script>

</body>
</html>



