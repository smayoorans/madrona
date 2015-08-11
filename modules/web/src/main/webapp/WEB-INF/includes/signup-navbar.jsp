<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<fmt:bundle basename="messages">
    <head>
    </head>
    <body>
    <div class="navbar navbar-fixed-top">

        <div class="navbar-inner">

            <div class="container">

                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>

                <a class="brand" href="index">
                    <fmt:message key="label.school.name"/>
                </a>

                <div class="nav-collapse">
                    <ul class="nav pull-right">
                        <li class="">
                            <a href="sign-in" class="">
                                Already have an account? Login now
                            </a>

                        </li>
                        <li class="">
                            <a href="index" class="">
                                <i class="icon-chevron-left"></i>
                                Back to Homepage
                            </a>

                        </li>
                    </ul>

                </div>
                <!--/.nav-collapse -->

            </div>
            <!-- /container -->

        </div>
        <!-- /navbar-inner -->

    </div>
    <!-- /navbar -->
    </body>
</fmt:bundle>
</html>