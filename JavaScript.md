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



# 数据类型
JavaScript 语言的每一个值，都属于某一种数据类型。JavaScript 的数据类型，共有六种。
这六种又可分为原始类型（3个）和合成类型（3个）。

## 原始类型
原始类型包括：**数值类型**、**字符串类型**、**布尔类型**。
如：
```js
var age = 20;
var name = "小明";
var learn = true;
```

## 合成类型
合成类型由：数值、字符串、布尔值 组成。
对象:
	因为一个对象往往是多个原始类型的值的合成，可以看作是一个存放各种值的容器。
如：
```js
var user = {
	name:"小明",
	age:20,
	learn:true
}
```

注意：
- undefined 和 null ，虽然属于合成类型，但通常把它看作特殊值。



# typeof 运算符
作用：判断数据类型(判断基本数据类型使用)。
基本数据包括：数值（number），字符串（string），布尔值（boolean），对象（object）。

如：
```js
// 数值返回number
typeof 123 

// 字符串返回string
typeof '123' // "number"

// 布尔值返回boolean
typeof false

// 对象返回object
typeof {} 
```

注意：
1. 数组也属于对象。
2. unll和undefined的区别：
	1. nu11一般代表对象为“没有”。
	2. undefined一般代表数值为“没有”。
	3. 其实语法效果几乎没有区别。



# 算数运算符
## 1. 加减乘除运算符
加减乘除运算符就是基本的数学运算符效果。
```js
console.log(10 + 3); // 13
console.log(10 - 3); // 7
console.log(10 * 3); // 30
console.log(10 / 3); // 3.333333
```

## 2. 余数运算符
余数运算符是比较常用的，因为在逻辑思维上寻找规律，余数运算符是很好用的。
```js
console.log(10 % 3); // 3
```

## 3. 自增和自减运算符
自增和自减运算符，是一元运算符，只需要一个运算子。它们的作用是将运算子首先转为数值，然后加上1或者减去1。
```js
var x = 1;
var y = 1;
++x // 2
--y // 0
```

自增和自减运算符有一个需要注意的地方:
- 就是放在变量之后，会**先返回变量操作前的值**，再进行自增/自减操作。
- 放在变量之前，会先进行自增/自减操作，再返回变量操作后的值。



# 赋值运算符
作用：用于给变量赋值。

| 运赋值算符 |       表达式        |
| :---: | :--------------: |
|   =   |      赋值运算符       |
|  +=   |  x+=y 等同于 x=x+y  |
|  -=   |  x-=y 等同于 x=x-y  |
|  \*=  | x\*=y 等同于 x=x\*y |
|  /=   |  x/=y 等同于 x=x/y  |
|  %=   |  x%=y 等同于 x=x%y  |


# 比较运算符
## 1. 认识比较运算符

| 比较运算符 |    描述    |
| :---: | :------: |
|   <   |  小于运算符   |
|   >   |  大于运算符   |
|  <=   | 小于或等于运算符 |
|  >=   | 大于或等于运算符 |
|  ==   |  相等运算符   |
|  ===  | 严格相等运算符  |
|  !=   |  不相等运算符  |
|  !==  | 严格不相等运算符 |

作用：
	比较运算符用于比较两个值的大小，然后返回一个布尔值，表示是否满足指定的条件。
```js
var num1 = 10;
var num2 = 20;
console.log(num1 > num2); // false
```

## 2. “\=\=\=” 与 ”\=\=“ 的区别
```js
var num1 = 10;
var num2 = "10";

// == 普通相等比较：仅比较数组本身是否相同。
console.log(num1 == num2); // true

/* === 严格相等比较：先比较数值本身是否相同，再比较类型本身是否相同。
 * 如果都相同，则返回 true，任何一个不相同或都不相同，则返回 false
 */ 
console.log(num1 === num2); // false
```


## 3. “!=” 与 “!\==” 的区别
和上面的同理。
```js
var num1 = 10;
var num2 = "10";

// != 普通不相等比较：仅比较数组本身是否相同。
console.log(num1 != num2); //false

/* !== 严格不相等比较：先比较数值本身是否相同，再比较类型本身是否相同。
 * 如果都相同，则返回 false，任何一个不相同或都不相同，则返回 true
 */ 
console.log(num1 !== num2); // true
```


# 布尔运算符
## 1. 取反运算符（!）
作用：将值进行取反。

布尔值取反：
```js
!true // false
!false // true
```

非布尔值取反：
	对于非布尔值，取反运算符会将其转为布尔值。可以这样记忆，以下六个值取反后为true，其他值都为false。
```js
// 以下6个取反值为true
console.log(!null);
console.log(!undefined);
console.log(!0);
console.log(!"");
console.log(!NaN);
console.log(!false);
```

## 2. 与运算符（&&）
```js
// && 多个条件都要满足，任何一个条件不满足，都是false
console.log(100>10 && 100>20 && 100>=20); // true
```

## 3. 或运算符（||）
```js
// || 多个条件中，只要有一个条件满足，就返回true，都不满足才返回false
console.log(10<20 || 10<5 || 10==20); // true
```


# 条件语句（记录到这）