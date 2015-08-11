<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title><fmt:message key="login.member.login"/></title>
</head>
<body>
<fmt:bundle basename="messages">

    <c:if test="${not empty param.statusCode}">
        <div class="control-group">
            <div class="controls">
                <div class="alert alert-success">
                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                    <strong>Message : </strong> ${param.statusCode}
                </div>
            </div>
        </div>
        <!-- /control-group -->
    </c:if>

    <div class="account-container">
        <div class="content clearfix">

            <form method="POST" action="<c:url value="/j_spring_security_check"/>">
                <h1><fmt:message key="login.member.login"/></h1>

                <div class="login-fields">

                    <p><fmt:message key="login.please.provide.your.details"/></p>

                    <div class="field">
                        <label for="username"><fmt:message key="login.username"/></label>
                        <input type="text" id="username" name="j_username" placeholder="Username"
                               class="login username-field"/>
                    </div>
                    <!-- /username field -->

                    <div class="field">
                        <label for="password"><fmt:message key="login.password"/></label>
                        <input type="password" id="password" name="j_password" placeholder="Password"
                               class="login password-field"/>
                    </div>
                    <!-- /password field -->

                </div>
                <!-- /login-fields -->

                <div class="login-actions">

                    <span class="login-checkbox">
                        <input name="_spring_security_remember_me" type="checkbox" class="field login-checkbox"/>
                        <label class="choice"><fmt:message key="login.keep.me.signed.in"/></label>
                    </span>

                    <button type="submit" class="button btn btn-success btn-large"><fmt:message
                            key="login.login"/></button>

                </div>
                <!-- login-actions -->

            </form>

        </div>
        <!-- /content -->

    </div>
    <!-- /account-container -->

    <div class="login-extra">
        <a href="#"><fmt:message key="login.reset.password"/></a>
    </div>
    <!-- /login-extra -->

</fmt:bundle>
</body>
</html>