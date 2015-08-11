<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<fmt:bundle basename="messages">
<head>
    <title><fmt:message key="registration.user.profile.information"/></title>
</head>
<body>

<div class="main main-inner">
    <div class="container">
        <div class="row">
            <div class="span12">
                <div class="widget">

                    <div class="widget-header">
                        <i class="icon-user"></i>

                        <h3><fmt:message key="registration.user.profile.information"/></h3>
                    </div>
                    <!-- /widget-header -->

                    <div class="widget-content">
                        <br>

                        <form:form id="edit-profile" class="form-horizontal" method="POST" action="add-user-action"
                                   commandName="user">
                            <fieldset>

                                <div class="control-group">
                                    <label class="control-label" for="firstName">
                                        <fmt:message key="sign.up.first.name"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="firstName" value="${userDetails.firstName}"
                                                    readonly="true" class="span6" path="firstName"/>
                                        <span><form:errors path="firstName" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->


                                <div class="control-group">
                                    <label class="control-label" for="lastName">
                                        <fmt:message key="sign.up.last.name"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="lastName" value="${userDetails.lastName}"
                                                    readonly="true" class="span6" path="lastName"/>
                                        <span><form:errors path="lastName" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="address">
                                        <fmt:message key="sign.up.home.address"/>
                                    </label>

                                    <div class="controls">
                                        <form:textarea rows="3" id="address" class="span6"
                                                       readonly="true" value="${userDetails.homeAddress}"
                                                       path="homeAddress"/>

                                        <span><form:errors path="homeAddress" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="phone">
                                        <fmt:message key="sign.up.phone"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="phone" class="span4" value="${userDetails.phone}"
                                                    readonly="true" path="phone"/>
                                        <span><form:errors path="phone" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="address">
                                        <fmt:message key="sign.up.email"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="email" class="span4" value="${userDetails.email}"
                                                    readonly="true" path="email"/>
                                        <span><form:errors path="email" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="dateOfBirth">
                                        <fmt:message key="sign.up.date.of.birth"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="date" id="dateOfBirth" value="${userDetails.dateOfBirth}"
                                                    class="span4" path="dateOfBirth"/>
                                        <span><form:errors path="dateOfBirth" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="gender">
                                        <fmt:message key="sign.up.gender"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="gender" class="span4" value="${userDetails.gender}"
                                                    readonly="true" path="gender"/>
                                        <span><form:errors path="gender" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="city">
                                        <fmt:message key="sign.up.city"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="city" class="span4" value="${userDetails.city}"
                                                    readonly="true" path="city"/>
                                        <span><form:errors path="city" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="country">
                                        <fmt:message key="sign.up.country"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="country" class="span4"
                                                    readonly="true" value="${userDetails.country}" path="country"/>
                                        <span><form:errors path="country" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <div class="control-group">
                                    <label class="control-label" for="profession">
                                        <fmt:message key="sign.up.profession"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="profession" class="span4"
                                                    readonly="true" value="${userDetails.profession}" path="profession"/>
                                        <span><form:errors path="profession" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <hr/>


                                <div class="control-group">
                                    <label class="control-label" for="userName">
                                        <fmt:message key="sign.up.user.name"/>
                                    </label>

                                    <div class="controls">
                                        <form:input type="text" id="userName" class="span4"
                                                    readonly="true" value="${userDetails.username}" path="username"/>
                                        <span><form:errors path="username" cssClass="form-field-error"/></span>
                                    </div>
                                    <!-- /controls -->
                                </div>
                                <!-- /control-group -->

                                <hr/>

                                <div class="form-actions">
                                    <button type="submit" class="btn btn-primary"><fmt:message
                                            key="sign.up.register"/></button>
                                    <button class="btn"><fmt:message key="button.cancel"/></button>
                                </div>
                                <!-- /form-actions -->
                            </fieldset>
                        </form:form>
                    </div>
                    <!-- /widget-content -->
                </div>
                <!-- /widget -->
            </div>
            <!-- /span8 -->
        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /main -->

</body>
</fmt:bundle>
</html>