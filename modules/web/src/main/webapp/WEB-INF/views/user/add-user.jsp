
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<fmt:bundle basename="messages">
    <head><title><fmt:message key="common.admin.add.user"/></title></head>
    <body>
    <br>

    <div class="main main-inner">
        <div class="container">
            <div class="row">
                <div class="span8">
                    <div class="widget">

                        <div class="widget-header">
                            <i class="icon-user"></i>

                            <h3><fmt:message key="common.admin.add.user"/></h3>
                        </div>
                        <!-- /widget-header -->

                        <div class="widget-content">
                            <br>

                            <form:form id="add-user" class="form-horizontal" method="POST" action="add-user-action"
                                       commandName="user">
                                <fieldset>

                                    <div class="control-group">
                                        <label class="control-label" for="userName">
                                            <fmt:message key="common.admin.user.username"/>
                                        </label>

                                        <div class="controls">
                                            <form:input type="text" id="username" class="span4" path="username"/>
                                            <span><form:errors path="username" cssClass="form-field-error"/></span>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->


                                    <div class="control-group">
                                        <label class="control-label" for="password">
                                            <fmt:message key="common.admin.user.password"/>
                                        </label>

                                        <div class="controls">
                                            <form:textarea class="form-control span4" rows="3" path="password"></form:textarea>
                                            <span><form:errors path="password" cssClass="form-field-error"/></span>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->

                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-primary"><fmt:message
                                                key="button.save"/></button>

                                        <button class="btn"><fmt:message key="button.cancel"/></button>
                                    </div>
                                    <!-- /form-actions -->

                                </fieldset>
                            </form:form>
                            <!-- /login-extra -->

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