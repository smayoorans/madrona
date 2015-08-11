<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<fmt:bundle basename="messages">
    <head>
    </head>
    <body>
    <div class="subnavbar">

        <div class="subnavbar-inner">

            <div class="container">

                <ul class="mainnav">

                    <li class="dropdown">
                        <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-dashboard"></i>
                            <span>User</span>
                            <b class="caret"></b>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a href="all-users">List Users</a></li>
                            <li><a href="#">Search User</a></li>
                            <li><a href="add-user">Add</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-dashboard"></i>
                            <span>Group</span>
                            <b class="caret"></b>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a href="all-groups">List Groups</a></li>
                            <li><a href="#">Search Group</a></li>
                            <li><a href="add-group">Add</a></li>
                        </ul>
                    </li>

                    <li class="dropdown">
                        <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-dashboard"></i>
                            <span>Permission</span>
                            <b class="caret"></b>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a href="all-roles">List Permissions</a></li>
                            <li><a href="#">Search Permission</a></li>
                            <li><a href="add-role">Add</a></li>
                        </ul>
                    </li>

                    <li class="dropdown">
                        <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-dashboard"></i>
                            <span>Module</span>
                            <b class="caret"></b>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a href="all-modules">List Modules</a></li>
                            <li><a href="#">Search Module</a></li>
                            <li><a href="add-module">Add</a></li>
                        </ul>
                    </li>

                </ul>
            </div>
            <!-- /container -->

        </div>
        <!-- /subnavbar-inner -->

    </div>
    <!-- /subnavbar -->
    </body>
</fmt:bundle>
</html>