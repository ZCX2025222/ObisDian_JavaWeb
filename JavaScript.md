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



# typeof 方法
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


# 条件语句
## 1. if语句
和其它计算机语言的if语句一样。
```js
if (布尔值)
{
	语句
}
```


## 2. if...else语句
和其它计算机语言的if语句一样。
```js
// 格式1
if (布尔值)
{
	语句1
}
else
{
	语句2
}

// -------------------

// 格式2，连续判断
if (布尔值)
{
	语句1
}
else if (布尔值)
{
	语句2
}
else if (布尔值)
{
	语句3
}
......
else
{
	语句4
}

// -------------------

// 格式3，嵌套判断
if (布尔值)
{
	if (布尔值)
	{
		语句1
	}
}
else
{
	语句2
}

```

## 3. switch语句
和其它计算机语言的if语句一样。
专门用于连续判断。
```js
switch (数值)
{
	// 将数值与每个case后的数值进行比较，如果相同，则执行该case下的语句。
	case 数值1:
		语句1 
		break;
	case 数值2:
		语句2 
		break;
	......
	// 当所有case都判断失败时，则执行这个语句。
	default:
		语句n
}
```
注意：
	每个case代码块内部的break语句不能少，需要注意的是，否则会接下去执行下一个case代码块，而不是跳出switch结构。


## 4. 三元运算符
用于逻辑判断，可以看做是if...else的简写版。
```js
(条件) ? 表达式1 : 表达式2;

// 连续判断形式
(条件1) ? 表达式1 : 
	(条件2) ? 表达式1 : 
	(条件3) ? 表达式1 :
	......
	(条件n) ? 表达式1 : 表达式2;
```
当条件为true时，执行表达式1；
当条件为false时，执行表达式2；


# 循环语句
## 1. for循环语句
如果你学习过其它计算机语言，那这个很好理解。
```js
for (初始化表达式; 布尔值表达式; 迭代因子)
{
	循环体
}

// for语句的三个表达式，可以省略任何一个，也可以全部省略。
// 如果三个表达式都不写，就会形成死循环。
for ( ; ; )
{
	循环体
}
```
for语句后面的括号里面，有三个表达式:
1. **初始化表达式(initialize)**：确定循环变量的初始值，只在循环开始时执行一次。
2. **布尔表达式(test)**：每轮循环开始时，都要执行这个条件表达式，只有值为真，才继续进行循环。
3. **迭代因子(increment)**：每轮循环的最后一个操作，通常用来递增循环变量。


## 2. while循环语句
```js
while (判断条件)
{
	循环体
}

// 如果条件一直为真，就进入了死循环。
while (1 或 true)
{
	循环体
}
```


# 跳转语句
break 语句和 continue 语句都具有跳转作用，可以让代码不按既有的顺序执行。
## 1. break语句
break 语句用于**跳出**代码块或循环，或者说是**立即终止所有循环**。
```js
// 输出结果为：0、1、2，没有3、4
for (var i = 0; i < 5; i++)
{
	if (i === 3)
	{
		break;
	}
	console.log(i);
}
```

## 2. continue语句
continue 语句用于**立即终止本轮循环**，返回循环结构的头部，开始**下一轮**循环。
```js
// 输出结果为：0、1、2、4，没有3
for (var i = 0; i < 5; i++)
{
	if (i === 3)
	{
		continue;
	}
	console.log(i);
}
```


# 字符串
**字符串就是零个或多个排在一起的字符，放在单引号或双引号之中。**
```js
var a = "双引号";
var b = '单引号';
var c = " '双引号嵌套单引号' ";
var d = ' "单引号嵌套双引号" ';

// 相同的引号要想连续嵌套，需要再被显示的引号前加“\”来将引号转义。
var e = " \"双双嵌套\" ";
var f = ' \'单单嵌套\' ';
```


# length 属性
作用：length 属性返回字符串的长度，该属性也是无法改变的。
比如：
```js
var s = "abcdefg";
console.log(s.length); // 返回7
```


# 字符串常用方法
## 1. charAt()
`charAt()` 把字符串当作字符串数组，输入数字索引来查找字符并返回。
索引从0开始。
```js
var s = new String('abcdefg');
console.log('abcdefg'.charAt(3)); // 返回 'd'
console.log('abcdefg'.charAt(s.length - 1)); // 返回 'g'
```

如果参数为负数，或大于等于字符串的长度，`charAt()` 返回空字符串。
```js
console.log('abcdefg'.charAt(-1)); // 返回 ""
console.log('abcdefg'.charAt(10)); // 返回 ""
```


## 2. concat()
`concat()` 方法用于连接两个字符串，返回一个新字符串，不改变原字符串。
```js
var s1 = '你好';
var s2 = '世界';
console.log(s1.concat(s2)); // 输出："你好世界"
```

`concat()`可以传递多个参数，每个参数用 ” , “ 隔开。
```js
console.log('1'.concat('2', '3')); // 输出："123"
```

如果参数不是字符串，`concat()` 方法会将其先转为字符串，然后再连接。
```js
var one = 1;
var two = 2;
var three = '3'
console.log(one.concat(two, three)); // 输出："123"
```

如果做字符串相加，是不需要使用`concat()`，可以使用+连接字符串。
```js
console.log('1' + '2' + '3'); // 输出："123"
```

`concat()`和`+`虽然功能相同，但还是有区别的:
1. `concat()`不管什么类型直接合并成字符串。
```js
var one = 1;
var two = 2;
var three = '3'
console.log(one.concat(two, three)); // 输出："123"
```
2. `+`是遇到数字类型直接做运算，遇到字符串和字符串相连接。
```js
var one = 1;
var two = 2;
var three = '3'
console.log(one + two + three); // 输出："33"
```

## 3. substring()
作用：
1. `substing()` 方法用于从原字符串取出子字符串并返回，不改变原字符串。
2. 它的第一个参数表示子字符串的开始位置，第二个位置表示结束位置(**返回结果不含该位置**)

```js
"abcd".substring(0, 2); // 返回“ab”
```

如果省略第二个参数，则表示子字符串一直到**原字符串的结束**。
```js
"abcd".substring(1); // 返回“bcd”
```

如果第一个参数**大于**第二个参数， `substring()` 方法会**自动更换两个参数的位置**。
```js
"abcd".substring(3, 0); // 返回“abc”
```

如果参数是负数，substring 方法会**自动将负数转为0**。
```js
"abcd".substring(-1, 2); // 返回“ab”
```

## 4. substr()
`subst()` 方法用于从原字符串取出子字符串并返回，不改变原字符串，跟 substing 方法的作用相同。
`subsr()` 方法的第一个参数是子字符串的开始位置(从0开始计算)，第二个参数是**子字符串的长度**。
```js
"abcdefg".substr(1,5); // 返回"bcde"
```

如果省略第二个参数，则表示子字符串一直到原字符串的结束。
```js
"abcdefg".substr(1); // 返回"bcdefg"
```

如果第一个参数是负数，表示倒数计算的字符位置。
第二个参数无论设置多大的值，返回的子字符串长度都不会超出第一个参数。
```js
"abcdefg".substr(-2); // 返回"fg"
// 3 < 4，返回3个。
"abcdefg".substr(-4, 3); // 返回"efg"
// 5 > 4，但实际返回4个。
"abcdefg".substr(-4, 5); // 返回"defg"
```

如果第二个参数是负数，将被自动转为0，因此会返回空字符串。
```js
"abcdefg".substr(-2, -10); // 返回""
```

## 5. indexOf()
`indexor()`方法用于确定一个字符串在另一个字符串中**第一次出现**的位置，返回结果是**匹配开始的位置**。
如果返回-1，就表示不匹配。
```js
"hello world".indexOf('0'); // 返回4
"hello world".indexOf('abc'); // 返回-1
```

`indexor()`方法还可以接受第二个参数，表示从该位置开始向后匹配。
```js
"hello world".indexOf('0', 6); // 返回7
```

## 6. trim()
`tim()` 方法用于去除字符串两端的空格，返回一个新字符串，不改变原字符串。
```js
"  hello world  ".trim(); // 返回："hello world"
```

该方法去除的不仅是空格，还包括制表符(\t、\v)、换行符(\n)和回车符(\r)。
```js
"\r\hello world \t".trim(); // 返回:"hello world"
```

ES6扩展方法：
1. `trimEnd()`：仅去掉最右边侧的空格。
2. `rimStart()`：仅去掉最左侧的空格。
```js
"  hello world  ".trimEnd(); // 返回："  hello world"
"  hello world  ".trimStart(); // 返回："hello world  "
```

## 7. split()
`split()` 方法按照给定规则分割字符串，返回一个由分割出来的子字符串组成的**数组**。
```js
"ab|cd|efg".split('|'); // 返回["ab", "cd", "efg"]
```

如果分割规则为**空字符串**，则返回数组的成员是原字符串的**每一个字符**。
```js
"ab|cd|efg".split(''); // 返回['a', 'b', 'c', 'd','e', 'f', 'g']
```

如果省略参数，则返回数组的唯一成员就是原字符串。
```js
"ab|cd|efg".split(); // 返回["abcdefg"]
```

`split()`方法还可以接受第二个参数，限定返回数组的**最大成员数**。
```js
"ab|cd|efg".split('|', 0); // 返回[]
"ab|cd|efg".split('|', 2); // 返回["ab", "cd"]
"ab|cd|efg".split('|', 5); // 返回["ab", "cd", "efg"]
```


# 数组
## 1. 认识数组
数组(array)是按次序排列的一组值。
每个值的位置都有编号(从0开始)，整个数组用方括号表示。
```js
var arr = ["ab", "cd", "efg"];
```
两端的方括号是数组的标志。 `ab` 是0号位置，`cd` 是1号位置，`efg` 是2号位置。(位置也被称为下标)

除了在定义时赋值，数组也可以先定义后赋值。
```js
var arr = [];

arr[0] = "ab";
arr[0] = "cd";
arr[0] = "efg";
```

**任何类型**的数据，都可以放入数组。
```js
var arr = [100, [1, 2, 3], false];
```

如果数组的元素还是数组，就形成了多维数组。
```js
// 一个二维数组
var a = [[1 ,2 ], [3 , 4]];
```

数组的`length`属性，返回数组的成员数量。
```js
var arr = ["ab", "cd", "efg"];
console.log(arr.length); // 返回3
```


## 2. 数组的遍历

for循环遍历数组
```js
var a = ["ab", "cd", "efg"];

for (var i; i<a.length; i++)
{
	console.log(a[i]);
}
```

while循环遍历数组
```js
var a = ["ab", "cd", "efg"];

while (i < a.length)
{
	console.log(a[i]);
	i++;
}
```

for...in遍历数组
```js
var a = ["ab", "cd", "efg"];

for (var i in a)
{
	console.log(a[i]);
}
```


# 数组常用的方法
## 1. Array.isArray()
是静态方法。
`Array.isArray()` 方法返回一个布尔值，**表示参数是否为数组**。
它可以**弥补** `typeof` 运算符的不足。
如果是数组，则返回`true`，否则返回`flase`。
```js
var arr = ["你好", 100, trye];

console.log(typeof arr); // 返回object
Array.isArray(arr);      // 返回true
```

## 2. push()和pop()
`push()`方法用于在数组的**未端添加一个或多个元素**，并返回添加新元素后的数组长度。
注意，该方法会**改变**原数组。
```js
var arr = [];
arr.push("你好"); // 1
arr.push("hello"); // 2
arr.push(true, {}); // 4

console.log(arr[arr]); // 返回["你好", "hello", true, {}]
```

`pop()` 方法用于**删除数组的最后一个元素**，并返回该元素。
注意，该方法会改变原数组。
```js
var arr = ["你好", "hello", true, {}];

arr.pop(); // {}被删除
arr.pop(); // true被删除

console.log(arr[arr]); // 返回["你好", "hello"]
```

## 3. shift()和unshift()
`shift()`方法用于**删除数组的第一个元素**，并返回该元素。
注意，该方法会改变原数组。
```js
var arr = ["你好", "hello", true];

arr.shift(); // "你好"被删除。
console.log(arr[arr]); // 返回["hello", true]
```

`shift()`方法可以遍历并清空一个数组。
```js
var list = [1, 2, 3, 4, 5, 6];
var item;

while(item = list.shift())
{
	console.log(item); // 最后返回[]
}
```

`unshift()`方法用于在数组的**第一个位置添加元素**，并返回添加新元素后的数组长度。
注意，该方法会改变原数组。
```js
var arr = ["你好", "hello", true];

arr.unshift("世界"); // 4
console.log(arr[arr]); // 返回["世界", "你好", "hello", true]
```

`unshift()` 方法可以接受多个参数，这些参数都会添加到目标数组头部..
```js
var arr = ["你好", "hello", true];

arr.shift("1", "2", "3"); // 6
console.log(arr[arr]); // 返回["1", "2", "3", "你好", "hello", true]
```

## 4. join()
 `join()` 方法以指定参数作为分隔符，将所有数组成员**连接为一个字符串**返回。
 如果不提供参数，默认用逗号分隔。
```js
var a = [1, 2, 3, 4, 5, 6];

a.jojn('');    // 返回"123456"
a.join(' ');   // 返回"1 2 3 4 5 6"
a.join(' | '); // 返回"1 | 2 | 3 | 4 | 5 | 6"
a.join();      // 返回"1,2,3,4,5,6" 
```

如果数组成员是`undefined`或`null`或空位，会被转成空字符串。
```js
var a = ["1", undefined, null, "2", ];

a.join('-'); //返回"1---2"
```

数组的`join()`配合字符串的`split()`可以实现数组与字符串的互换。
```js
var arr = ["a", "b", "c"];
var myArr = arr.join("");
console.log(myArr);
console.log(myArr.split(""));
```

## 5. concat()
`coneat()`方法用于多个数组的合并。
它将新数组的成员，添加到原数组成员的后部，然后返回一个新数组，原数组不变。
```js
// 返回结果为["hello", "world"]
["hello"].concat([world]);

// 返回结果为[1, 2, 3, 4, 5, 6, 7, 8, 9]
[1, 2, 3].concat(4, 5, 6, [7, 8, 9])
```

应用场景：上拉加载，合并数据。

## 6. reverse()
`reverse()` 方法用于颠倒排列数组元素，返回改变后的数组。
注意，该方法将改变原数组。
```js
var a = ['a', 'c','c'];
a.reverse();
console.log(a); // 返回['c', 'b', 'a']
```

实现一个字符串反转排列
```js
var str = "hello";
str.split("").reverse().join("");
```

## 7. indexOf()
`indexOf()`方法返回给定元素在数组中**第一次出现的位置**，如果没有出现则返回-1。
```js
var arr = ['a', 'b', 'a', 'c'];

arr.indexOf('a'); // 返回0
arr.indexOf('c'); // 返回3
```

`indexOf()`方法还可以接受第二个参数，表示搜索的开始位置。
```js
var arr = ['a', 'b', 'a', 'c'];

arr.indexOf('a', 1); // 返回2
arr.indexOf('b', 2); // 返回-1
```


# 函数 function
函数是一段可以反复调用的代码块。
## 1. 函数的声明
`function`命令:
1. `function`命令声明的代码区块，就是一个函数
2. function命令后面是函数名，函数名后面是一对圆括号，里面是传入函数的参数。函数体放在大括号里面。
```js
function print(s)
{
	console.log(s);
}
```

## 2. 函数名的提升
JavaScript 引擎将函数名视同变量名，所以采用`function`命令声明函数时，整个函数会像变量声明一样，被提升到代码头部。
```js
print(1);

function print(s)
{
	console.log(s);
}
```

## 3. 函数参数
函数运行的时候，有时需要提供外部数据，不同的外部数据会得到不同的结果，这种外部数据就叫参数。
```js
function square(x, y)
{
	console.log(x + y);
}

square(1, 2); // 返回3
```

## 4. 函数返回值
JavaScript 函数提供两个接口实现与外界的交互：
- 其中参数作为入口，接收外界信息。
- 返回值作为出口，把运算结果反馈给外界。

```js
function square(x, y)
{
	return x + y;
}

var num = square(1, 2);
console.log(num); // 输出3
```
注意：`return`后面不能再添加任何代码，因为不会执行。


# 对象









