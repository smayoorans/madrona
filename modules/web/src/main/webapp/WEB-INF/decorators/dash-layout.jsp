<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
    <title><decorator:title default="Admin Dashboard" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/css/bootstrap-responsive.min.css"/>"/>
    <!-- Add custom CSS here -->
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/css/style.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/css/pages/dashboard.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/css/font-awesome.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/css/google-font.css"/>" />
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/google-code-prettify/prettify.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/css/base.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/admin-theme/css/datetimepicker.css"/>"/>
    <%--<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>--%>
    <decorator:head />
</head>
<body>
    <%@ include file="/WEB-INF/includes/admin-navbar.jsp"%>
    <%@ include file="/WEB-INF/includes/subnavbar.jsp"%>

    <div class="main">
        <div class="main-inner">
            <div class="container">
                <div class="row">
                    <%--<%@ include file="/WEB-INF/includes/side-menu.jsp"%>--%>
                        <decorator:body />
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /main-inner -->
        </div>
    <!-- /main -->

    <%--<%@ include file="/WEB-INF/includes/extra.jsp"%>--%>
    <%@ include file="/WEB-INF/includes/footer.jsp"%>

    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/js/jquery-1.7.2.min.js"/>" ></script>
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/js/bootstrap-select.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/js/bootstrap.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/js/excanvas.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/js/base.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/js/bootstrap-select.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/js/bootshop.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/google-code-prettify/prettify.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/admin-theme/js/bootstrap-datetimepicker.js"/>"></script>

    <script language="javascript" type="text/javascript" src="<c:url value="/resources/admin-theme/js/chart.min.js"/>"></script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/admin-theme/js/full-calendar/fullcalendar.min.js"/>"></script>

    <script type="text/javascript">
        $('.form_date').datetimepicker({
            language:  'fr',
            weekStart: 1,
            todayBtn:  1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 0
        });
    </script>

  <%--  <script type="text/javascript">
        $(window).on('load', function () {

            $('.selectpicker').selectpicker();

        });
    </script>--%>
<%--    <script>

        var lineChartData = {
            labels: ["January", "February", "March", "April", "May", "June", "July"],
            datasets: [
                {
                    fillColor: "rgba(220,220,220,0.5)",
                    strokeColor: "rgba(220,220,220,1)",
                    pointColor: "rgba(220,220,220,1)",
                    pointStrokeColor: "#fff",
                    data: [65, 59, 90, 81, 56, 55, 40]
                },
                {
                    fillColor: "rgba(151,187,205,0.5)",
                    strokeColor: "rgba(151,187,205,1)",
                    pointColor: "rgba(151,187,205,1)",
                    pointStrokeColor: "#fff",
                    data: [28, 48, 40, 19, 96, 27, 100]
                }
            ]

        }

        var myLine = new Chart(document.getElementById("area-chart").getContext("2d")).Line(lineChartData);


        var barChartData = {
            labels: ["January", "February", "March", "April", "May", "June", "July"],
            datasets: [
                {
                    fillColor: "rgba(220,220,220,0.5)",
                    strokeColor: "rgba(220,220,220,1)",
                    data: [65, 59, 90, 81, 56, 55, 40]
                },
                {
                    fillColor: "rgba(151,187,205,0.5)",
                    strokeColor: "rgba(151,187,205,1)",
                    data: [28, 48, 40, 19, 96, 27, 100]
                }
            ]

        }

        $(document).ready(function() {
            var date = new Date();
            var d = date.getDate();
            var m = date.getMonth();
            var y = date.getFullYear();
            var calendar = $('#calendar').fullCalendar({
                header: {
                    left: 'prev,next today',
                    center: 'title',
                    right: 'month,agendaWeek,agendaDay'
                },
                selectable: true,
                selectHelper: true,
                select: function(start, end, allDay) {
                    var title = prompt('Event Title:');
                    if (title) {
                        calendar.fullCalendar('renderEvent',
                                {
                                    title: title,
                                    start: start,
                                    end: end,
                                    allDay: allDay
                                },
                                true // make the event "stick"
                        );
                    }
                    calendar.fullCalendar('unselect');
                },
                editable: true,
                events: [
                    {
                        title: 'All Day Event',
                        start: new Date(y, m, 1)
                    },
                    {
                        title: 'Long Event',
                        start: new Date(y, m, d+5),
                        end: new Date(y, m, d+7)
                    },
                    {
                        id: 999,
                        title: 'Repeating Event',
                        start: new Date(y, m, d-3, 16, 0),
                        allDay: false
                    },
                    {
                        id: 999,
                        title: 'Repeating Event',
                        start: new Date(y, m, d+4, 16, 0),
                        allDay: false
                    },
                    {
                        title: 'Meeting',
                        start: new Date(y, m, d, 10, 30),
                        allDay: false
                    },
                    {
                        title: 'Lunch',
                        start: new Date(y, m, d, 12, 0),
                        end: new Date(y, m, d, 14, 0),
                        allDay: false
                    },
                    {
                        title: 'Birthday Party',
                        start: new Date(y, m, d+1, 19, 0),
                        end: new Date(y, m, d+1, 22, 30),
                        allDay: false
                    },
                    {
                        title: 'EGrappler.com',
                        start: new Date(y, m, 28),
                        end: new Date(y, m, 29),
                        url: 'http://EGrappler.com/'
                    }
                ]
            });
        });
    </script>--%><!-- /Calendar -->
</body>
</html>



