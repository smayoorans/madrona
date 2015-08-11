<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<fmt:bundle basename="messages">
    <head><title><fmt:message key="common.admin.add.role"/></title></head>
    <body>
    <br>

    <div class="main main-inner">
        <div class="container">
            <div class="row">
                <div class="span8">
                    <div class="widget">

                        <div class="widget-header">
                            <i class="icon-user"></i>

                            <h3><fmt:message key="common.admin.add.role"/></h3>
                        </div>
                        <!-- /widget-header -->

                        <div class="widget-content">
                            <br>

                            <form:form id="add-role" class="form-horizontal" method="POST" action="add-role-action" commandName="roleBean">
                                <fieldset>

                                    <div class="control-group">
                                        <label class="control-label" for="roleName">
                                            <fmt:message key="common.admin.role.name"/>
                                        </label>

                                        <div class="controls">
                                            <form:input type="text" id="roleName" class="span4" path="name"/>
                                            <%--<span><form:errors path="name" cssClass="form-field-error"/></span>--%>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->


                                    <div class="control-group">
                                        <label class="control-label" for="description">
                                            <fmt:message key="common.admin.role.description"/>
                                        </label>

                                        <div class="controls">
                                            <form:textarea class="form-control span4" rows="3" path="description"></form:textarea>
                                            <%--<span><form:errors path="description" cssClass="form-field-error"/></span>--%>
                                        </div>
                                        <!-- /controls -->
                                    </div>
                                    <!-- /control-group -->

                                    <div class="control-group">
                                        <label class="control-label" for="description">
                                            <fmt:message key="common.admin.group.name"/>
                                        </label>

                                        <div class="controls">
                                            <%--<form:textarea class="form-control span4" rows="3" path="description"></form:textarea>--%>
                                            <form:select path="groupIds" cssClass="form-control span4" size="5" multiple="true">
                                                <c:forEach items="${roleBean.groups}" var="group">
                                                    <form:option value="${group.id}">${group.name}</form:option>
                                                </c:forEach>
                                            </form:select>
                                            <%--<span><form:errors path="groupIds" cssClass="form-field-error"/></span>--%>
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