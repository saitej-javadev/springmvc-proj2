# springmvc-proj2
_This project is  basic examples of Model, ModelAndView , configuring Dispatcher servlet in web.xml file and 
configuring spring bean configuration file in dispatcher-servlet.xml_

# steps to create the app
_i.   Create Maven Project with maven-archetype-webapp
ii.  Add Spring MVC, Spring context, Java servlet Api dependencies in pom.xml
iii. Configure DispatcherServlet in web.xml (WEB-INF/web.xml)
iv.  Configure Spring Bean Configuration in dispatcher-servlet.xml(create this file in WEB/INF/) and 
     configure ViewResolver
v.   Create controller and map with the request
vi.  Configure Tomcat server in Intellij
vii. Run the Application_     
  




**> web.xml for configuring DispatcherServlet**
<pre><code>
&lt;!DOCTYPE web-app PUBLIC
        "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
        "http://java.sun.com/dtd/web-app_2_3.dtd" @gt;

&lt;web-app>
    &lt;display-name>Archetype Created Web Application&lt;/display-name>
    &lt;servlet>
        &lt;servlet-name>dispatcher&lt;/servlet-name>
        &lt;servlet-class>org.springframework.web.servlet.DispatcherServlet&lt;/servlet-class>
    &lt;/servlet>
    &lt;servlet-mapping>
        &lt;servlet-name>dispatcher&lt;/servlet-name>
        &lt;url-pattern>/&lt;/url-pattern>
    &lt;/servlet-mapping>
&lt;/web-app>
</code>
</pre>

**> configure spring bean configuration file  dispatcher-servlet.xml(<servlet-name>-servlet.xml convention we need to folow)** 
<pre><code>
&lt;?xml version="1.0" encoding="UTF-8"?>
&lt;beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans-4.3.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">

    &lt;context:component-scan base-package="com.saitej.controller"@gt;


    &lt;bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        &lt;property name="prefix" value="/WEB-INF/views/"@gt;
        &lt;property name="suffix" value=".jsp"@gt;
    &lt;/bean>
&lt;/beans>
</code></pre>

**To use EL expression is jsp:**

<pre>
<code>
&lt;%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
</code>
</pre>

**To use JSTL:**
Add below tag in jsp file and Add below JSTL dependency in pom.xml
<pre>
<code>
&lt;%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</code>
</pre>

<pre>
<code>
   &lt;dependency>
      &lt;groupId>javax.servlet&lt;/groupId>
      &lt;artifactId>jstl&lt;/artifactId>
      &lt;version>1.2&lt;/version>
    &lt;/dependency>

</code>
</pre>