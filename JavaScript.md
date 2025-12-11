简称：JS
# 语句
JavaScript 程序的单位是行（line），也就是一行一行地执行。一般情况下，每一行就是一个语句。
如：
```js
var num = 10;
```
语句以分号结尾，一个分号就表示一个语句结束。

# 标识符
标识符(identifier)指的是用来识别各种值的合法名称。最常见的标识符就是变量名。
标识符是由:**字母**、**美元符号($)**、**下划线(\_)和数字组成**，其中数字不能开头。
注意：
- 中文是合法的标识符，可以用作变量名(不推荐)。


# JavaScript 保留关键字
JavaScript有一些保留字，不能用作标识符:
```js
arguments、break、case、catch、class、const、continue、 debugger、default、delete、do、else、enum、eval、export、 extends、false、finally、for、function、if、implements、import、in、instanceof、interface、let、new、nul、package、private、protected、public、return、static、super、switch、this、throw、true、try、typeof、var、void、while、with、yield
```

# 变量
```js
var num = 10;
```
**var** 用于定义变量num。

## 变量提升
lavaScript 引擎的工作方式是，先解析代码，获取所有被声明的变量，然后再一行一行地运行。
这造成的结果，**就是所有的变量的声明语句，都会被提升到代码的头部，这就叫做变量提升(hoisting)。**

举个例子：
原本的代码是这样的：
```js
console.log(num);
var num = 10;
```
变量提升后，实际代码的执行顺序为：
```js
var age;
console.log(num);
num = 10;
```
打印结果为：**undefined**

# JavaScript 引入到文件
## 1. js引入标签\<script>\</scripy>
需要使用 js 引入标签：**\<script> \</script>**
该标签放在：\<**body> \</body>（推荐）** 或 **\<head> \</head>** 标签中。

## 2. 3种方式引入
有3种方式可以将 js 文件引入到 HTML 文件中。
### 1. 嵌入到HTML文件中
如：
```html
<body>
	<script> var age = 20 </script>
</body>
```

### 2. 引入本地独立js文件
如：
```html
<body>
	<script type="text/javascript" src="./itbaizhan.js">> </script>
</body>
```

### 3. 引入网络来源文件
如：
```html
<body>
	<script src="https://cdn.bootcdn.net/jquery.min.js"> </script>
</body>
```


# JavaScript 注释
在js文件中：
```js
 // 这是单行注释
 
 /*
	这是
	多行
	注释
*/
```

如果嵌入在HTML文件文件中，就要用：
```html
<!-- 这种注释 -->
```


# JavaScript 输出方式
JavaScript有很多种输出方式，都可以让我们更直观的看到程序运行的结果。
以下是常用的3种：
```js
// 弹出框
// 在浏览器中弹出一个对话框,然后把要输出的内容展示出来,alert都是把要输出的内容首先转换为字符串然后在输出的。
alert("要输出的内容");

// 页面输出，会像普通文件一样直接在网页中显示。
document.write("要输出的内容");

// 在控制台输出内容
console.1og("要输出的内容");
```



