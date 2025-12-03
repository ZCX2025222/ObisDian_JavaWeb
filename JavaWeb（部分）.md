# 准备资源
工具：IDEA专业版。
使用tomcat版本：tomcat-10.1.29
jar包：tomcat-10.1.29\lib\servlet-api.jar

# Servlet 技术
## 初识Servlet
### 1. Servlet的应用程序体系结构：
![[assets/图片/Servlet技术/Servlet应用程序体系结构.png]]
打个比喻：

| 餐厅角色        | Servlet MVC架构       | 职责说明                                          |
| ----------- | ------------------- | --------------------------------------------- |
| 顾客          | 客户端（Client/Browser） | 发起请求的人。你想吃什么，告诉服务员。                           |
| 餐厅前台        | Web 服务器（如 Tomcat）   | 负责接待顾客，接收订单，并把最终做好的菜端上来。                      |
| 服务员（Waiter） | Servlet             | **核心协调者**。接收你的点单（请求），通知后厨做菜，然后把做好的菜（数据）交给传菜员。 |
| 后厨（Kitchen） | Service/DAO（Model）  | 业务逻辑和数据处理**。根据订单准备食材、烹饪、装盘。他们才是真正“做菜”的人。      |
| 传菜员 & 餐盘    | JSP（View）           | **展示结果**。传菜员把做好的菜（数据）按照美观的摆盘（HTML/CSS）呈现给你。   |

### 2. Servlet接口方法

| 方法声明                                                           | 功能描述                                                       |
| -------------------------------------------------------------- | ---------------------------------------------------------- |
| void init(ServletConfig config)                                | Servlet实列化后，Servlet容器调用该方法完成初始工作。                          |
| ServletConfig getServletConfig()                               | 用于获取Servlet对象的配置信息，返回ServletConfig对象。                      |
| String getServletInfo()                                        | 返回一个包含Servlet信息的字符串。                                       |
| void service(ServletRequest request, ServletResponse response) | 负责响应用户的请求，当容器接收到客户端访问Servlet对象的请求时，就会调用此方法，所以可以在里面写响应逻辑部分。 |
| void destroy()                                                 | 当服务器关闭或Servlet对象被移除时，容器调用此方法将对象销毁，释放资源。                    |

### 3. HttpServlet常用请求方法

| 方法声明                                                                    | 功能描述                     |
| ----------------------------------------------------------------------- | ------------------------ |
| protected void doGet(HttpServletRequest req, HttpServletResponse resp)  | 用于处理**GET**类型的HTTP请求方法。  |
| protected void doPost(HttpServletRequest req, HttpServletResponse resp) | 用于处理**POST**类型的HTTP请求方法。 |
| protected void doPut(HttpServletRequest req, HttpServletResponse resp)  | 用于处理**PUT**类型的HTTP请求方法。  |

## Servlet映射
### 1. 在web.xml中配置
Servlet标签下的子元素：

| 属性名                | 类型     | 描述                                |
| ------------------ | ------ | --------------------------------- |
| \<servlet-name>    | String | 指定Servlat的名称，一般与Servlet类名相同，要求唯一。 |
| \<servlet-class>   | String | 指定Servlat类的位置，包括包名与类名。            |
| \<description>     | String | 指定该Servlet的描述信息。                  |
| \<display-name>    | String | 指定该Servlet的显示名。                   |
| \<servlet-mapping> |        |                                   |

一般直接在注解里写 urlPatterns 属性就行，name属性隐式默认为该类名。
如：
```java
@WebServlet("/login")
```

### 2. Servlet的生命周期
1. 初始化阶段：容器调用init()方法，在生命周期内只调用一次。
2. 运行阶段：容器调用service()方法，在生命周期内可被调用多次。
3. 销毁阶段：当服务器关闭或web应用被移出容器时，容器调用destroy()方法，在生命周期内只调用一次。


## ServletConfig接口


## ServletContext接口
每个Web应用都有一个唯一的ServletContext对象。
可实现一个Web应用中多个Servlet之间的数据共享。
接口方法如下：

| 方法说明                                  | 返回类型           | 功能描述                                                 |
| ------------------------------------- | -------------- | ---------------------------------------------------- |
| getServletContext()                   | ServletContext | 返回一个代表当前web应用的ServletContext对象。                      |
| getAttributeNames()                   | Enumeration    | 返回 Enumeration 对象，该对象包含了存放在 ServletContext 中的所有域属性名。 |
| getAttribute(Sting name)              | Object         | 根据参数指定的域属性名返回一个与之匹配的域属性值。                            |
| setAttribute(String name, Object obj) | void           | 设置 ServletContext 的域属性，其中 name 是域属性名，obj 是域属性值。      |
| removeAttritute(String name)          | void           | 根据参数指定的域属性名，从ServletContext 中删除匹配的域属性。               |

获取对象：
```java
ServletContext context = this.getServletContext();
```

## HTTPservletResponse接口
由一下3部分组成：
- 状态行。
- 响应消息头。
- 响应消息体。

通过设置该对象，可以解决中文显示乱码问题。
### 1. 输出响应消息方法

| 方法                 | 返回类型                | 说明           |
| ------------------ | ------------------- | ------------ |
| getOutputStream(); | ServletOutputStream | 能输出二进制格式的正文。 |
| getWriter();       | PrintWriter         | 能输出字符型正文。    |

如：
```java
PrintWriter out = resp.getWriter(); //获取对象。
out.write(data); //对象调用方法输出正文。
```

### 2. 实现请求重定向
可用于当Servlet接收到一个无法处理的请求或完成部分处理后需转向其他Servlet时。
```java
resp.sendRedirect("URL"); //跳转到URL下的Servlet。
```

## HTTPservletRequest接口
### 1. 实现请求转发
在一个请求下，从一个Servlet处理请求完成后跳转到另一个Servlet继续处理请求，此过程是在一个响应中完成的，因此每次请求的请求域可以被多个Servlet共享，URL显示第一个Servlet。


| 方法                               | 返回类型              | 说明                 |
| -------------------------------- | ----------------- | ------------------ |
| getRequestDispatcher(Sring path) | RequestDispatcher | 返回对象，由请求对象创建。      |
| forward(请求对象， 响应对象)              | requestDispatcher | 将当前请求转发给其他servelt。 |
如：
```java
RequestDispatcher dispatcher = req.getRequestDispatcher("某个servlet");
```

注意：从请求开始到相应结束，属于一次请求，所以可以使用request域进行数据共享。

### 2. 获取请求参数
可用来获取如表单的数据。

| 方法                              | 返回类型        | 说明                                                                    |
| ------------------------------- | ----------- | --------------------------------------------------------------------- |
| getParameter(String name)       | String      | 获取指定名称的参数值。若指定的参数名没有，返回null；若有指定的参数名但没有参数值，返回空串：若指定的参数名包含多个参数值，返回第一个。 |
| getParameterValues(String name) | String      | 返回一个数组，可用于多个相同的参数名的不同的参数值的获取。                                         |
| getParameterNames()             | Enumeration | 返回一个包含所有参数名的对象。                                                       |
| getParameterMap()               | Map         | 返回一个装有所有参数名和参数值的对象。                                                   |

如：
```java
String name = req.getParameter("name"); //返回name对应的一个值。
```

### 3. 通过Request对象传递数据
属于同一个请求中的数据才可以通过 ServletRequest 对象传递数据。

| 方法                                   | 返回类型        | 说明                                              |
| ------------------------------------ | ----------- | ----------------------------------------------- |
| setAttribute(String name, Object o); | void        | 将一个对象与一个name关联后存入到ServletRequest中。              |
| getAttribute(String name);           | Ojbect      | 从对象中返回指定名称的属性对象。                                |
| removeAttribute(String name);        | void        | 从对象中删除指定名称的属性。                                  |
| getAttributeNames();                 | Enumeration | 返回一个包含 ServletRequest 对象中所有属性名的 Enumeration 对象。 |

## 域
在JavaWeb中，**域指的是数据的有效范围和生命周期**。它提供了在不同组件（Servlet、JSP、Filter等）之间共享数据的机制。
### 3个域对象
主要有一下3种域对象，按范围由**小到到大**排列：

|        域名         |       范围        |       生命周期       |        共享对象        |
| :---------------: | :-------------: | :--------------: | :----------------: |
|   Request（请求域）    |  一次HTTP请求范围内。   |   从请求开始到响应结束。    | HttpServletRequest |
|   Session域（会话域）   | 一次用户会话（浏览器不关闭）。 | 从会话开始到会话超时或手动销毁。 |    HttpSession     |
| Application域（应用域） |    整个Web应用。     |   从应用启动到应用停止。    |   ServletContext   |

获取Session对象：
```java
HttpSession session = request.getSession();
```
获取Application域对象：
```java
ServletContext application = getServletContext();
```

### 域对象的通用方法
所有域对象都提供相同的数据操作方法：
```java
// 存储数据
void setAttribute(String name, Object value);

// 获取数据
Object getAttribute(String name);

// 移除数据
void removeAttribute(String name);

// 获取所有属性名
Enumeration<String> getAttributeNames();
```


---

## .properties文件
这是**属性配置文件（.properties 文件）**，在 Java 开发中常用于存储应用的**配置信息**，比如数据库连接参数（URL、用户名、密码）、系统自定义参数等。

书写格式：**键 = 值** 或 **键 : 值**
注释使用：# 或 ! 开头。
```text
Company = itcast
Address = 中国 北京 
# 数据库配置 
jdbc.url = jdbc:mysql://localhost:3306/test jdbc.username = root 
jdbc.password = 123456
```

注意点：
1. 一行只能写一个键值对。
2. 键、值前后的**空格会被保留**。
3. 如果是Maven项目，则该文件可以在src文件下创建，因为构建后会自动将该文件复制到classes文件中。



---

## 请求重定向与请求转发的区别

| 特性         | 请求转发（Forward）                                                     | 请求重定向（Redirect）                             |
| :--------- | ----------------------------------------------------------------- | ------------------------------------------- |
| **行为本质**   | 服务器内部行为。                                                          | 客服端行为。                                      |
| **请求次数**   | 1次                                                                | 2次                                          |
| **浏览器地址栏** | 不改变，显示的是第一次请求的URL。                                                | 改变，显示的是最终目标资源的UTL。                          |
| **数据共享**   | 共享同一个Request对象，数据可以传递。                                            | 不共享Request对象，数据无法直接传递（可通过URL参数或Session传递）。  |
| **性能**     | 较高（仅一次网络往返）。                                                      | 较低（两次网络往返）。                                 |
| **目标资源**   | 仅限于当前Web应用内部资源。                                                   | 可以是当前应用、其他应用、或其他网站的任何URL。                   |
| **API/用法** | request.getRequestDispatcher("/path").forward(request, response); | response.sendRedirect("/projectName/path"); |


 
---

# 会话技术
一种服务器跟踪用户的技术。

## Cookie对象
一种会话技术。将会话过程中的数据保存到用户的浏览器的缓存中或本地硬盘中。


| 方法                                 | 返回类型     | 说明                                 |
| ---------------------------------- | -------- | ---------------------------------- |
| Cookie(String name, String value); | Cookie   | 构造方法。                              |
| getName();                         | String   | 返回 Cookie 的名称。                     |
| setValue(String newValue);         | void     | 为 Cookie 设置一个新的值。                  |
| getVlaue();                        | String   | 返回 Cookie 的值。                      |
| getCookies                         | Cookie[] | 返回一个包含所有 cookie 的数组，需要被request 调用。 |
| addCookie(Cookie cookie)           | void     | 将 cookie 发送到浏览器上，需要被response 调用。   |
| setMaxAge(int expity);             | void     | 设置 Cookie 在浏览器客户机上保持有效的秒数。         |
| getMaxAge()；                       | int      | 返回 Cookie 在浏览器客户机上保持有效的秒数。         |
| setPath(String uri)                | void     | 设置该 Cookie 项的有效目录路径。               |
| getPath()                          | String   | 返回该 Cookie 项的有效目录路径。               |
| setDomain(String pattern)          | void     | 设置该 Cookie 项的有效域。                  |
| getDomain()                        | String   | 返回该 Cookie 项的有效域。                  |
| setVersion(int v)                  | void     | 设置该 Cookie 项采用的协议版本。               |
| getVersion()                       | int      | 返回该 Cookie 项采用的协议版本。               |
| setComment(String purpose)         | void     | 设置该 Cookie 项的注解部分。                 |
| getComment()                       | String   | 返回该 Cookie 项的注解部分。                 |
| setSecure(boolean flag)            | void     | 设置该 Cookie 项是否只能使用安全的协议传送。         |
| getSecure()                        | boolean  | 返回该 Cookie 项是否只能使用安全的协议传送。         |

1\. setMaxAge(int exptiy) 和 getMaxAge() 方法：
	从运行时间开始，在没有超过有效秒数之前，cookie都保持有效。
	将值设置为正整数，cookie信息会被保存在本地硬盘中；
	设置为负数，cookie信息会被保存在浏览器的缓存中，关闭浏览器会将cookie删除；
	设置为0，则浏览器会立即删除该cookie信息。

2\. setPath(String uri) 和 setPath() 方法：
	若没有设置path属性，则 cookie 只对当前访问路径的所属的目录及其子目录有效。
	若设置为“/”，则 cookie 对该站点的所有目录都有效。

3\. cookie 编码
	需要编码的情况：
		1. 包含特殊字符，如：空格、分号、逗号等。
		2. 包含非ASCII字符（中文等）。
		3. 包含等号、引号等。
	为了确保Cookie的可靠性和安全性，建议对所有Cookie值进行编码解码处理，特别是当你不确定数据内容时。这是一种防御性编程的好习惯。

基本的cookie使用：
    创建cookie:
```java
Cookie cookie = new Cookie("zcx", "123456"); //创建cookie对象。 
cookie.setMaxAge(60 * 5); // 设置有效时间为5分钟。
resp.addCookie(cookie);   //将cookie对象发送到浏览器。
```
获取cookie:
```java
Cookie[] cookies = req.getCookies();  
boolean foundCookie = false; // 添加标志变量  
  
if (cookies != null) 
{  
    // 首先检查所有cookie，看是否存在名为"zcx"的cookie  
    for (Cookie cookie : cookies) 
    {  
        if (cookie.getName().equals("zcx"))
		{  
            foundCookie = true; // 找到匹配的cookie  
            break; // 找到后可以提前退出循环  
        }  
    }  
    // 根据是否找到cookie决定跳转方向  
    if (foundCookie) 
    {  
        resp.sendRedirect("index.jsp");  
    } 
    else 
    {  
        resp.sendRedirect("longin_on.jsp");  
    }  
} 
else
{  
	// 如果没有任何cookie，跳转到登录失败页面  
	resp.sendRedirect("longin_on.jsp");  
}
```


---

## Session对象
另一种会话技术，可以将会话数据存储到服务器中。
可用于创建购物车。
运行流程：
1. 用户第一次访问 → 服务器创建Session → 生成唯一Session ID
2. 服务器将Session ID通过Cookie返回给浏览器
3. 浏览器后续请求自动携带Session ID Cookie
4. 服务器通过Session ID找到对应的Session对象


| 方法                                      | 返回类型           | 说明                                                                                    |
| --------------------------------------- | -------------- | ------------------------------------------------------------------------------------- |
| getSession(boolean create);             | HttpSession    | create为true，则在相关对象不存在时创建对象，否则不创建新对象，返回null。                                           |
| getSession();                           | HttpSession    | 默认create为true时的情况。                                                                    |
| getId()                                 | String         | 返回与当前 HttpSession 对象关联的会话标识符。                                                         |
| getCreationTime()                       | long           | 用于返回 HttpSession 创建的时间，以毫秒形式表示。                                                       |
| getLastAccessedTime()                   | long           | 用于返回客户端最后一次发送请求的时间，这个时间表示最近一次访问 Session 的时间。                                          |
| setMaxInactiveInterval(int interval)    | void           | 用于设置当前 HttpSession 对象可空闲的以秒为单位的最长时间，也就是修改当前会话的默认超时时间。                                 |
| isNew()                                 | boolean        | 判断当前 HttpSession 对象是否是新创建的。                                                           |
| invalidate()                            | void           | 强制使当前 HttpSession 对象失效。                                                               |
| getServletContext()                     | ServletContext | 返回当前 HttpSession 对象所属的 Web 应用程序的 ServletContext 对象，即代表当前 Web 应用程序的 ServletContext 对象。 |
| setAttribute(String name, Object value) | void           | 将一个对象与一个名称关联后存储到当前的 HttpSession 对象中。                                                  |
| getAttribute()                          | String         | 从当前 HttpSession 对象中返回指定名称的属性。                                                         |
| removeAttribute(String name)            | void           | 从当前 HttpSession 对象中删除指定名称的属性。                                                         |

session的生命周期
1. 在用户第一次访问JSP、servlet或调用 getSession(true) 强制生成时才会创建session。
2. 当session对象超过存活时间或调用 invalidate() 方法强制失效时才会失效。


举个例子：
```java
// 从请求中获取或创建Session  
HttpSession session = req.getSession();  
// 设置Session的过期时间为30秒  
session.setMaxInactiveInterval(30);  
// 存储数据到Session  
session.setAttribute("zcx", "123");  
// 从Session中获取数据  
String zcx = (String) session.getAttribute("zcx");  
System.out.println(zcx);  
// 从Session中移除数据  
session.removeAttribute("zcx");  
// 获取Session的ID  
String sessionId = session.getId();  
System.out.println(sessionId);  
// 立即销毁Session，清除所有数据  
session.invalidate();
```

## Session 与 Cookie 的区别

| 特性       | Session          | Cookie               |
| -------- | ---------------- | -------------------- |
| **存储位置** | 服务器端             | 客户端浏览器               |
| **安全性**  | 高（数据在服务器）        | 低（数据在客户端）            |
| **存储大小** | 理论上无限制（受服务器内存限制） | 每个Cookie≤4KB，每域名≤50个 |
| **存储类型** | 任意Java对象         | 只能是字符串               |
| **生命周期** | 可配置，默认30分钟不活动则销毁 | 可设置长期有效              |
| **性能影响** | 占用服务器内存          | 每次请求都会携带             |


---

# JSP技术
## jsp介绍
动态网页技术。
是一种java和HTML共同存在，能动态显示内容的servlet扩展。
有以下特点：
1. 跨平台。
2. 业务代码相分离。将页面的开发和应用程序的开发分离开。
3. 组件重用。
4. 预编译。

jsp无法直接显示在网页上，必需被servlet调用。
jsp运行原理：
1. 客户端发送请求，请求访问jsp文件。
2. jsp容器将jsp文件转换成java文件。
3. 再编译成class文件。
4. servlet容器执行class文件，产生servlet实列。
5. 再生成HTML，返回响应。


## jsp脚本元素
作用：将java代码嵌入到HTML中。
符号：<% %>
有如下3种类型：

| 语法格式                    | 类型             | 说明                                                   |
| ----------------------- | -------------- | ---------------------------------------------------- |
| <% java代码（变量、方法、表达式等）%> | JSP Scriptlets | 将可执行的java代码片段嵌入到HTML中。<br>不能进行方法的定义。                 |
| <%! 定义变量或方法等 %>         | 声明标识           | 定义**全局**变量或方法。                                       |
| <%= expression %>       | JSP表达式         | 参数 expression 可以是java语言中任意完整的表达式，最终运算结果以字符串的形式输出到页面。 |
注意：
- 通过声明标识创建的变量和方法在当前jsp页面中有效，它的生命周期是从创建开始到服务器结束。
- 代码片段创建的变量或方法也是在当前jsp页面有效，但它的生命周期是页面关闭后就会被销毁。


## jsp注释
有如下几种：

| 注释类型                           | 说明                                            |
| ------------------------------ | --------------------------------------------- |
| //注释内容                         | 单行注释。                                         |
| /* 注释内容1 <br>    注释内容2 \*/     | 多行注释。                                         |
| /*\*<br>  注释内容1<br>  注释内容2 \*/ | 提示文档注释。是对代码结构和功能的描述。                          |
| <%-- 注释内容 --%>                 | 隐藏注释。在查看页面源代码是看不到该注释，提高安全性。                   |
| \<!-- <%= java代码 %> -->        | 动态注释。HTML注释对jsp嵌入代码无效，可以利用它们的组合构成动态的HTML注释文本。 |
注意：
- 除了隐藏注释外，HTML注释可以通过在网页中查看源代码的方式看到。


## jsp指令
### page指令
作用：对页面的某些特性进行描述。
指令格式：
```jsp
<%@ page 属性名1="属性值1" 属性名2="属性值2" ......%>
```
指令常用属性如下：

| 属性名称         | 取值范围           | 说明                                                                                                                |
| ------------ | :------------- | ----------------------------------------------------------------------------------------------------------------- |
| language     | java           | 指定 JSP 页面所用的脚本语言，默认为 Java。                                                                                        |
| import       | 任何包名、类名        | 指定 JSP 页面翻译成的 Servlet 源文件中导入的包或类。import 是**唯一可以声明多次**的 page 指令属性。一个 import 属性可以引用多个类，中间用英文逗号隔开。                   |
| session      | true、false     | 指定该 JSP 是否内置 Session 对象，如果为 true，则说明内置 Session 对象，可以直接使用，否则没有内置 Session 对象。在默认情况下，session 属性的值为 true。             |
| isErrorPage  | true、false     | 指定该页面是否为错误处理页面，如果为 true，则 JSP 内置有一个 Exception 对象的 exception，可直接使用。在默认情况下，isErrorPage 的值为 false。                   |
| errorPage    | 某个 JSP 页面的相对路径 | 指定一个错误页面，如果该 JSP 程序抛出一个未捕捉的异常，则转到 errorPage 指定的页面。errorPage 指定页面的 isErrorPage 属性值为 true，且内置的 Exception 对象为未捕捉的异常。 |
| contentType  | 有效的文档类型        | 指定当前 JSP 页面的 MIME 类型和字符编码。                                                                                        |
| pageEncoding | 当前页面           | 指定页面编码格式。                                                                                                         |

### include指令
作用：在一个jsp页面中，包含另一个jsp页面。
指令格式：
```jsp
<%@ include file="被包含的文件地址" %>
```
注意：
1. include 只有一个 file 属性，插入的文件路径建议使用相对路径。
2. 被引入的文件显示内容被引入的位置显示。
3. 在进行包含时，为了使整个页面的层次结构不发生冲突，建议在被包含的页面中将\<html>、\<body>等标签删除，因为在包含页面的文件中已经有这些标签。


### taglib指令
作用：在页面中引用标签库，指定标签前缀，可通过前缀来引用标签库中标签。

## jsp动作元素 <jsp:include>
作用：用于向当前页面引入其他文件，被引入的文件可以是动态文件或静态文件。
语法格式：
```jsp
<jsp:include page="URL" flush="true/false">
```
属性说明：
	1. page：用于指定被引入文件的相对路径。
	2. flush：用于指定是否将当前页面的输出内容刷新到客户端。默认值为 false。

运行原理：
- 程序会请求转发到被包含的页面，并将执行结构输出到浏览器中，然后返回包含页，进行执行后面的代码。因为服务器执行的是多个文件，使用如果一个页面包含了多个文件，jsp编译器会分别对被包含的文件进行编译。


与include指令的区别：

| 区别            | <jsp:include>    | include指令               |
| ------------- | ---------------- | ----------------------- |
| **执行次数**      | 每次请求都会执行         | 一次（编译时）                 |
| **性能**        | 较低（每次请求都需要调用）    | 较高（编译后就是一个文件）           |
| **是否拥有重复变量名** | 可以拥有（每个文件单独编译）   | 不能拥有重复的变量名或方法（最终生成一个文件） |
| **编译过程**      | 每个文件单独编译，最后合并输出。 | 先合并文件，再进行编译输出。          |
| **是否支持表达式**   | page属性支持jsp表达式。  | file属性不支持任何表达式。         |

## 请求转发元素 <jsp:forward>
将当前请求转发到其他web资源，执行后，当前页面将不在执行，而是执行转发的页面。
语法格式：
```jsp
<jsp:forward page="relativaURL">
```
因为是从服务器内部转发的，所以转发后动作栏的地址不会发生变化。

## jsp隐式对象
jsp默认创建的对象，可直接在jsp页面中调用。

| 对象名         | 类型                  | 说明                      |
| ----------- | ------------------- | ----------------------- |
| out         | jspWriter           | 用于页面输出。                 |
| request     | HttpServletRequest  | 得到用户请求信息。               |
| response    | HttpServletResponse | 服务器向客户端的回应信息。           |
| confing     | ServletCofing       | 服务器配置，可以取得初始化参数。        |
| session     | HttpSession         | 用于保存用户的信息。              |
| application | ServletContext      | 所有用户的共享信息。              |
| page        | Object              | 指当前页面转换后的Servlet类的实列。   |
| pageContext | PageContext         | JSP的页面容器。               |
| exception   | Throwable           | 标识JSP页面所发生的异常，在错误页才起作用。 |
除out、pageContext、exception对象外，其它对象在前面已经讲过，故接下来介绍这3种对象。

### out对象
使用方法：
```jsp
<% out.println("文本内容") %>
```
运行过程：
1. out对象先将数据写入到JspWriter缓冲区中
2. 当调用 ServletResponse.getWriter() 方法时，才将out对象的缓冲区的数据写入到容器提供的缓冲区中。而 getWriter() 方法直接将数据写入容器缓冲区中。
3. 容器会按照缓冲区中数据的存放顺序输出内容。
4. 这会导致由 getWriter() 方法输出的语句比out对象输出的语句快一步在网页中显示。


使用page指令解决out对象输出速度慢的问题。
```jsp
<!--直接将out对象的缓冲区修改为0kb,out对象的输出数据直接写入容器缓冲区-->
<%@ page buffer="0kb"%>
```

### pageContext对象
作用：用于获取其它8个隐式对象。

（待记录）

### exception对象
作用：用于处理异常信息。


---

# EL
## 认识EL
作用：
- 一种表达式语言，可以简化jsp中的数据访问操作。
- 用于代替 jsp 中繁琐的<%= %>脚本片段，能更简洁地读取域对象（如 request、session）里的数据。

语法格式：
```jsp
${表达式}
```
由有一下特点：
1. EL可以与JavaScript语句使用。
2. EL可以自动进行类型转换。
3. EL可以使用算数运算、逻辑运算、关系运输和条件运算等。
4. EL不仅可以访问一般变量，还可以访问 JavaBean 中的的属性、嵌套属性和集合对象。
5. EL可以获取pageContext对象，进而获取其它内置对象。
6. 在使用EL进行除法运算时，如果除数为0，则返回表示无穷大的Infinity，而不是报错。
7. EL可以访问jsp的作用域（request、session、applicstion、pagr）。


## EL中的标识符
作用：用于标记名称，由任意的大小写字符、数字、下划线组成。
需注意以下规范：
1. 不能是以数字开头。
2. 不能是EL中的关键字，如：and、or、gt等。
3. 不能是EL中的隐式对象，如：pageContext。
4. 不能包含单引号、双引号、减号等特殊字符。


## EL中的关键字
关键字就是编程语言里事先定义好并赋予了特殊含义的单词。
EL中有如下关键字：

| 关键字        | 等价符号          |
| ---------- | ------------- |
| and        | 逻辑与（&&）       |
| or         | 逻辑或（\|\|）     |
| not        | 逻辑非（!）        |
| eq         | 等于（==）        |
| ne         | 不等于（!=）       |
| gt         | 大于（>）         |
| lt         | 小于（<）         |
| ge         | 大于等于（>=）      |
| le         | 小于等于（<=）      |
| true       | 布尔“真”         |
| false      | 布尔“假”         |
| null       | 表示空值          |
| empty      | 判断空值，返回布尔值    |
| div        | 除法（/）         |
| mod        | 取模（%）         |
| instanceof | 判断对象是否是某个类的实列 |

## EL中的变量
EL中的变量就是一个基本的存储单元，不用事先定义就可以直接使用。
EL可以将变量映射到对象上：
```jsp
${prodect}
```
prodect 就是一个变量，通过该表达式就可以访问该变量的值。

## EL中的常量
由如下几种：

| 常量类型   | 值          |
| ------ | ---------- |
| 布尔常量   | true/false |
| 整形常量   |            |
| 浮点数常量  |            |
| 字符串常量  |            |
| Null常量 |            |

## EL中的访问运算符
EL提供了**点运算符**和**方括号运算符**，它们的功能相同。

1\. 点运算符（.）
用于访问jsp页面中某些对象的属性。如：
```jsp
${customer.name}
```
访问customer对象中的name属性。

2\. 方括号运算符（\[]） 
功能与点运算符相同，但可以访问带一些特殊符号的对象，如：
```jsp
${user["My-Name"]}
```

注意：
1. 中括号运算符还可以访问List集合或数组中指定索引的元素，如${users\[0]}表示访问users中第0号索引的元素。
2. 这两个运算符可以混合使用，如${users\[0].userName}表示访问users中第0号索引元素的userName属性。


## EL中的运算符
1\. 算数运算符
包括：

| 算数运算符    | 说明     |
| -------- | ------ |
| +        | 加      |
| -        | 减      |
| *        | 乘      |
| /（或 div） | 除（有小数） |
| %（或 mod） | 除（取余）  |

注意：
-  EL中的 ”+“ 运算符不能进行字符串拼接，但可以连接两个可以被转换成字符型的串，EL会自动将这两个字符串转换为数值型，再进行加法运算。


2\. 比较运算符
EL中的比较运算符用于比较两个操作数的大小，操作数可以是各种常量、EL变量或EL表达式，执行结构为布尔型。


| 比较运算符   | 说明   |
| ------- | ---- |
| ==（或eq） | 等于   |
| !=（或ne） | 不等于  |
| <（或lt）  | 小于   |
| >（或gt）  | 大于   |
| <=（或le） | 小于等于 |
| >=（或ge） | 大于等于 |
注意：
- 为了避免与jsp页面的标签起冲突，后4种运算符建议使用字母。
- 如果运算符后面是数字，要用空格将运算符和数字隔开。


3\. 逻辑运算符
EL中的逻辑运算符用于对结果为布尔类型的表达式进行运算，运算结果仍为布尔类型。


| 逻辑运算符      | 说明  |
| ---------- | --- |
| &&（或 and）  | 逻辑与 |
| \|\|（或 or） | 逻辑或 |
| !（或 not）   | 逻辑非 |
|            |     |

4\. empty运算符
在EL中，用于判断对象是否为空。该运算符是一个前缀运算符，即empty运算符位于操作数前方，用于确定一个对象或变量是否为null或空。
返回值为布尔型。

语法格式：
```jsp
${empty expression}
```
判断 expression 对象是否为空。

注意：
- 一个变量或对象为 null 或 空 ，代表的意义是不同的。
- null表示这个变量没有指名任何对象。
- 而空表示这个变量指名了对象，但所属的对象内容为空，如：空字符串。


5\. 条件运算符
EL中的条件运算符用于执行某种条件判断。类似于三目运算符。
语法格式：
```jsp
${A?B:C}
```

6\. ”()“运算符
EL中的小括号用于改变其它运算符的优先级。

## EL隐式对象

### 1\. 访问环境信息的隐式对象
提供 param 和 paramValues 两个对象，专门用于获取客户端访问jsp页面时传递的请求参数。

param 对象用于获取请求参数的某个值，它是Map类型，若参数不存在，则返回空字符串。
```jsp
<!--返回param对象的num属性的值-->
${param.num}    
```
paramValues 对象用于获取请求参数的所有值，返回数组。
```jsp
<!--索引访问，返回属性名为nums的0号索引的属性值-->
${paramValues.nums[0]} 
```

### 2\. Cookie对象
EL提供 Cookie 隐式对象。
该对象集合了所有 Cookie 信息的 Map 集合，Map 集合中元素的键为各个 Cookie 的名称，值则为对应的 Cookie 对象

用法如下：
```jsp
${cookie.userName}          <!--获取 cookie 对象的信息-->
${cookie.userName.name}     <!--获取 cookie 对象的名称-->
${cookie.userName.value}    <!--获取 cookie 对象的值-->
```

### 3. initParam对象
initParam对象用于获取web应用初始化参数的值。

举个例子：
先在web.xml文件中设置一个初始化参数 author 。
```xml
<context-param>
	<param-name>author</param-name>
	<param-value>你好</param-value>
</context-param>
```
然后在jsp文件
```jsp
author的值为：${initParam.author}
```
最后运行，网页会显示：“author的值为：你好”。

### 4. 访问域对象的数据
```jsp
<!-- 1. 默认查找（按 page→request→session→application 顺序） -->
${username} <!-- 等价于从4个域中依次查找名为username的属性 -->
  
<!-- 2. 指定域查找（精准高效） --> 
${pageScope.user} <!-- 仅从page域查找user对象 --> ${requestScope.orderId} <!-- 仅从request域查找订单ID --> ${sessionScope.loginUser} <!-- 仅从session域查找登录用户 --> ${applicationScope.systemName} <!-- 仅从application域查找系统名称 -->
```


---

# JSTL
## 认识JSTL
JSTL是一个不断完善的开放源代码的jsp标签库。
包含了以下5类标准标签库：

| 标签库名   | 使用指令                                                                  |
| ------ | --------------------------------------------------------------------- |
| 核心标签库  | <%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>      |
| 格式标签库  | <%@ taglib prefix="fmt" url="http://java.sun.com/jsp/jstl/fmt" %>     |
| SQL标签库 | <%@ taglib prefix="sql" url="http://java.sun.com/jsp/jstl/sql" %>     |
| XML标签库 | <%@ taglib prefix="xml" url="http://java.sun.com/jsp/jstl/xml" %>     |
| 函数标签库  | <%@ taglib prefix="fn" url="http://java.sun.com/jsp/jstl/function" %> |

## Core标签库
注意：“\[]” 号中的属性是可选的，实际应用中不写方括号。
### <c:out>标签
一种常用的表达式标签，可以将一段文本内容或表达式输出到客户端。
如果输出的内容包含需要进行转义的特殊字符，则自动转换。
语法格式：
```jsp
<!--没有标签体-->
<c:out value="value" [default="defaultValue"] [escapeXml="{true|false}"]/>

<!--有标签体-->
<c:out value="value" [escapeXml="{true|false}"]>
	defaultValue
</c:out>
```
属性含义如下：
- value属性用于指定输出的文本内容。
- default属性用于指定当value属性为null时所输出的默认值，该属性可选。
- escapeXml属性用于指定是否将>、<等特殊字符进行HTML编码转换后再输出，默认值为true。

### <c:remove>移除标签
一种表达式标签。
作用：用于移除指定的 jsp 范围内的变量。
语法格式：
```jsp
<c:remove var="name" [scope="范围"]/>
```
属性含义如下：
- var：用于指定要移除的变量名。
- scope：用于指定变量的有效范围，可选择有 page、request、session、application，默认值为 page。若未指定，则会移除所有范围内的目标变量。


### <c:if>标签
一种流程控制标签。
作用：在jsp页面中进行if条件判断。
语法格式如下：
```jsp
<!--没有标签体-->
<c:if test="testCondition" [var="result" ]
[scope="{page|request|session|application}"]/>

<!--有标签体-->
<c:if test="testCondition" [var="result"]
[scope="{page|request|session|application}"]>
	你好
</c:if>
```
属性含义如下：
- test属性：用于设置逻辑表达式。
- var属性：可选属性，用于存储条件评估的结果(true/false)，而不是用于引用要判断的对象。
- scope属性：用于指定 var 变量的作用范围，默认为 page 。

若 test 属性的值为true，则输出标签体中的内容，若为false，则输出空字符串。

### <c:choose>标签
一种条件判断标签。
作用：在jsp页面中进行 if-else 条件判断。
该标签必须与 <c:when>、<c:otherwise> 标签一起组合使用。

下面进行介绍：
1\. <c:choose> 标签
1. 该标签没有属性。
2. 在它的标签体中只能嵌套一个或多个 <c:when> 标签，零个或一个 <c:otherwise> 标签。
3. 且同一个 <c:choose> 标签中所有的 <c:when> 标签必须写在 <c:otherwise> 标签前面。

语法格式如下：
```jsp
<c:choose>
	<c:when text="boole">
		你好
	</c:when>
	<c:otherwise>
		世界
	</c:otherwise>
</c:choose>
```

2\. <c:when>标签
- 该标签只有一个 test 属性，该属性值为布尔类型。
- test 属性支持2动态值，其值可以是一个条件表达式。
- 若条件表达式的值为 true， 则执行该标签体的内容。

语法格式如下：
```jsp
<c:when text="testCondition">
	Body content
</c:when>
```

3\. <c:otherwise>标签
- 该标签没有属性。
- 必须作为 <c:choose> 标签的最后分支出现。
- 当所有 <c:when> 标签都不成立时，才执行输出该标签体的内容。

语法格式如下：
```jsp
<c:otherwise>
	conditional block
</c:otherwise>
```

### <c:forEach>循环标签
作用：在jsp文件中对集合对象进行循环迭代操作。
语法格式如下：
```jsp
<!--迭代包含多个对象的集合-->
<c:forEach [var="varName"] items="collection" [varStatus="varStatusName"]
[begin="begin"] [end="end"] [step="step"]>
	body content
</c:forEach>

<!--迭代指定范围内的集合-->
<c:forEach [var="varName"] [varStatus="varStatusName"] begin="begin" end="end" [step="step"]>
	body content
</c:forEach>
```
属性含义如下：
- var属性：创建一个变量，用于将 当前迭代到的元素保存到变量中，可通过此变量来调用存储元素的元素属性值。
- items属性：用于指定 将要迭代的集合对象。
- varStatus属性：用于指定 将当前迭代状态信息的对象保存到page域中的名称。
- begin属性：用于指定从集合中的第几个元素开始进行迭代。begin 的索引值从0开始，如                    果没有指定 items 属性，就从指定的值开始迭代，指定迭代介绍为止。
- step属性：用于指定迭代的步长，即迭代因子的增量。
- end属性：用于指定迭代结束的索引。


### URL相关标签
作用：可以在jsp页面实现 URL 的重写和重定向等特殊的功能。

未记录完！


---

# JavaBean技术（未记录）




---

# JSP开发模型（未记录）




---


# Servlet的高级特性（未记录）




---

# JDBC
## 认识 JDBC
JDBC 是一套用于执行SQL语句的java API。应用程序可通过这头API连接到关系数据库，并使用SQL语句完成对数据库中的增删改查。

**1\. Driver 接口**
是所有 JDBC 驱动程序必须实现的接口，该接口专门提供给数据库厂商使用。

**2\. DriverManager 类**
用于加载 JDBC 驱动并创建于数据库的连接。
该类定义了两个比较主要的静态方法：

| 方法名称                                               | 功能描述                                |
| -------------------------------------------------- | ----------------------------------- |
| registerDriver(Driver driver)                      | 用于向 DriverManager 中注册给定的 JDBC 驱动程序。 |
| getConnection(String utl, String user, String pwd) | 用于建立于数据库的连接，并返回连接的 Connection 对象。   |
registerDriver() 方法使用：
```java
//注册数据库驱动
DriverManager.registerDriver("com.mysql.cj.jdbc.Driver");
```
getConnection() 方法使用
```java
String url = "jdbc:mysql://localhost:3306/"+databasename+"?serverTimezone=UTC";

//三个参数分别是：数据库的URL路径，登陆用户名，登陆密码
Connection conn = DriverManager.getConnection(url, "root", datapwd);
```

**3\. Connection 接口**
该接口表示Java程序和数据库的连接，只有获得该连接对象后才能访问数据库，并操作数据表。
该接口定义了以下常用的方法：

| 方法名称                         | 功能描述                                         |
| ---------------------------- | -------------------------------------------- |
| getMetaData()                | 返回表示数据库的 DatabaseMetaData 对象。                |
| createStatement()            | 创建一个能够执行  SQL 语句的 Statement 对象。              |
| prepareStatement(String sql) | 创建一个 PrepareStatement 对象来将参数化的 SQL 语句发送到数据库。 |
| prepareCall(String sql)      | 创建一个 CallableStatement 对象来调用数据库存储过程。         |


**4\. Statement 接口**
该接口用于执行静态的 SQL 语句，并返回一个结果对象。
该接口定义了3个常用的方法：

| 方法名称                      | 功能描述                                                                   |
| ------------------------- | ---------------------------------------------------------------------- |
| execute(String sql)       | 用于执行各种 SQL 语句，返回一个布尔类型的值。如果为true，则表示所执行的 SQL 语句有查询结果，否则没有。             |
| executeUpdate(String sql) | 用于执行 SQL 中的 insert、update、delete语句。返回一个int类型的值，表示数据库中受该 SQL 语句影响的记录条数。 |
| executeQuery(String sql)  | 用于执行 SQL 中的 select 语句，返回一个表示查询结果的 ResultSet 对象。                        |

**5\. PreparedStatement 接口**
该接口是 Statemnt 接口的子接口，用于执行预编译的 SQL 语句。
就是能将 变量 与 SQL 语句整合后，再发送到数据库中执行。
使用占位符 ? 来代替参数，然后通过 seetter() 方法为 SQL 语句的参数赋值。

该接口提供了以下常用的方法：

| 方法名称                                                                      | 功能描述                                                                        |
| ------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| executeUpdate()                                                           | 在此 PreparedStatement 对象中执行 SQL 语句，该语句必须是一个 DML 语句或者无返回内容的 SQL 语句，例如 DDL 语句。 |
| executeQuery()                                                            | 在此 PreparedStatement 对象中执行 SQL 查询，该方法返回的是 ResultSet 对象。                     |
| setInt(int parameterIndex, int x)                                         | 将指定参数设置为给定的 int 值。                                                          |
| setFloat(int parameterIndex, float x)                                     | 将指定参数设置为给定的 float 值。                                                        |
| setString(int parameterIndex, String x)                                   | 将指定参数设置为给定的 String 值。                                                       |
| setDate(int parameterIndex, Date x)                                       | 将指定参数设置为给定的 Date 值（注意：Date 类型是 java.sql.Date）。                              |
| addBatch()                                                                | 将一组参数添加到此 PreparedStatement 对象的批处理命令中。                                      |
| setCharacterStream(int parameterIndex, java.io.Reader reader, int length) | 将指定的输入流写入数据库的文本字段中。                                                         |
| setBinaryStream(int parameterIndex, java.io.InputStream x, int length)    | 将二进制的输入流数据写入二进制字段中。                                                         |

**6\. ResultSet 接口**
该接口用于保存 JDBC 执行查询时返回的结果集，该结构集封装在一个逻辑表中。
该接口内部有个指向表格数据行的指针。
对象初始化时指针指向第0行（表格以1开头）。
调用 next() 方法可将指针移动到下一行。
如果指针指向的行没有数据，则返回 flase，有数据，则返回 true。
可作为 while 循环的判断条件。

该接口常用方法如下：

| 方法名称                         | 功能描述                             |
| ---------------------------- | -------------------------------- |
| getString(int columnlndex)   | 用于获取指定字段的 String 类型的值，参数代表字段索引。  |
| getString(String columnName) | 用于获取指定字段的 String 类型的值，参数代表字段的名称。 |
| getInt(int columnIndex)      | 用于获取指定字段的 int 类型的值，参数代表字段的索引。    |
| getInt(String columnName)    | 用于获取指定字段的 int 类型的值，参数代表字段的名称。    |
| getDate(int columnIndex)     | 用于获取指定字段的 Date 类型的值，参数代表字段的索引。   |
| getDate(String columnName)   | 用于获取指定字段的 Date 类型的值，参数代表字段的名称。   |
| next()                       | 将游标从当前位置向下移一行。                   |
| absolute(int row)            | 将游标移动到此 ResultSet 对象的指定行。        |
| afterLast()                  | 将游标移动到此 ResultSet 对象的末尾，即最后一行之后。 |
| beforeFirst()                | 将游标移动到此 ResultSet 对象的开头，即第一行之前。  |
| previous()                   | 将游标移动到此 ResultSet 对象的上一行。        |
| last()                       | 将游标移动到此 ResultSet 对象的最后一行。       |

## 编写 JDBC 程序
JDBC 的使用可以按以下几个步骤进行：
```java
//1.加载并注册数据库驱动
DriverManager.registerDriver(Driver driver);
//或者
Class.forName("DriverName");

//2.通过 DriverManager 获取数据库连接
//其中的三个参数分别是：连接数据库的URL地址、登陆数据库的用户名和密码
Connection conn = DriverManager.getConnection(String url, String user, String pwd);

//3.通过 Coonection 对象获取 Statement 对象
/*有三种方式获取:
	1.调用 createStatement() 方法：创建基本的 Statement 对象。
	2.调用 prepareStatement() 方法：创建 PreparedStatement 对象。
	3.调用 prepareCall() 方法：创建 CallableStatement 对象。
*/
Statement stmt = conn.createStatement();

//4.使用 Statement 对象执行SQL语句
/*所有的 Statement 对象都有以下三种执行SQL语句的方法：
	1.execute()：可以执行任何SQL语句。
	2.executeQuery()：通常执行查询语句，执行后返回代表结果的集的 ResultSet 对象。
	3.executeUpdate()：主要用于执行MDL和DDL语句。执行DML语句时，返回受SQL语句影响的行                        数，执行DDL语句则返回0。
*/
//例：执行SQL语句，获取结果集ResultSet
ResultSet rs = stmt.executeQuery(sql);

//5.操作ResultSet结果集。

//6.关闭连接，释放资源。

```



---

# 数据库连接池（未记录）


# 未完待续

# 为域的部分添加page域



