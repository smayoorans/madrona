<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<fmt:bundle basename="messages">
<head>
</head>
<body>
<div id="sidebar" class="span3">
    <ul id="sideManu" class="nav nav-tabs nav-stacked">
        <li class="subMenu open"><a> STUDENTS </a>
            <ul>
                <li><a class="active" href="/school-web/add-student"><i class="icon-chevron-right"></i> Student Registration </a></li>
                <li><a href="/school-web/list-students"><i class="icon-chevron-right"></i> View Student Details</a></li>

                <li><a href="/school-web/add-grade"><i class="icon-chevron-right"></i> Add Class</a></li>
                <li><a href="/school-web/list-grades"><i class="icon-chevron-right"></i> View Classes Details</a></li>

                <li><a href="/school-web/add-house"><i class="icon-chevron-right"></i> Add Sport House</a></li>
                <li><a href="/school-web/list-houses"><i class="icon-chevron-right"></i> View House Details</a></li>

                <li><a href="/school-web/add-subject"><i class="icon-chevron-right"></i> Add Subject</a></li>
                <li><a href="/school-web/list-subjects"><i class="icon-chevron-right"></i> View Subject Details</a></li>

                <li><a href="/school-web/add-staff"><i class="icon-chevron-right"></i> Add Staff</a></li>
                <li><a href="/school-web/list-staffs"><i class="icon-chevron-right"></i> View Staffs Details</a></li>

                <li><a href="/school-web/add-subject"><i class="icon-chevron-right"></i> Add Subject</a></li>

                <li><a href="/school-web/add-subject"><i class="icon-chevron-right"></i> Add Subject</a></li>
            </ul>
        </li>
        <li class="subMenu"><a> MANAGE USERS </a>
            <ul style="display:none">
                <li><a href="/school-web/userView"><i class="icon-chevron-right"></i> View Users </a></li>
                <li><a href="#"><i class="icon-chevron-right"></i> Edit Users</a></li>

            </ul>
        </li>
    </ul>
</div>

</body>
</fmt:bundle>
</html>
