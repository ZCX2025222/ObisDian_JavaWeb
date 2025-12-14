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
## 1. 对象介绍
什么是对象?对象(object)是JavaScript 语言的**核心概念**，也是最重要的数据类型。
简单说，对象就是一组“**键值对**”(key-value)的集合，是一种无序的复合数据集合。
```js
var user = {
	name: "abcd",
	age: "13"
};
```

对象的每一个键名又称为“**属性**”(property)，它的“**键值**“可以是任何数据类型。
如果一个属性的值为**函数**，通常把这个属性称为“**方法**”，它可以像函数那样调用。
```js
var user = {
	getName: function(name){
		return name;
	}
};

user.genName("abcd"); // 返回"abcd"
```

如果属性的值还是一个对象，就形成了链式引用。
```js
var user = {
	name: "abcd",
	age: 13,
	// 值为两个键值对，属于对象。
	container:{
		frontEnd:['a', 'b', 'c'],
		backEnd:["java", "python"]
	}
}

user.container.frontEnd; // 返回['a', 'b', 'c']
```

## 2. Math对象
Math是JavaScript 的原生对象，提供各种数学功能。

### 2.1 Math.abs()
`Math.abs()`方法返回参数值的绝对值。
```js
Math.abs(2);  // 返回2
Math.abs(-2); // 返回2
```

### 2.2Math.max()和Math.min()
`Math.max()`方法返回参数之中最大的那个值。
`Math.min()`返回最小的那个值。
如果参数为空，`Math.min()`返回`lnfinity`，`Math.max()`返回`-lnfinity`。
```js
Math.max(2, -1, 5); // 返回5
Math.min(2, -1, 5); // 返回-1
Math.max();         // 返回lnfinity
Math.min();         // 返回-lnginity
```

### 2.3 Math.floor() 和 Math.ceil()
`Math.floor()`方法返回**小于**参数值的最大整数（向下取整）。
`Math.ceil()`方法返回**大于**参数值的最小整数（向上取整）。
```js
Math.floor(3.2);  // 返回3
Math.floor(-3.7); // 返回-4
Math.ceil(3.2);   // 返回4
Math.ceil(-3.7);  // 返回-3
```

### 2.4 Math.random()
`Math.random()`返回 0 到 1 之间的一个伪随机数，可能等于 0，但是一定小于 1。
```js
Math.random(); // 0.65482957295975
```
任意范围内的随机数生成函数如下：
```js
function getRandomArbitrary(min, max){
	return Math.random() * (max - min) + min;
}

getRandomArbitrary(5, 10);
```

## 3. Date对象
`Date`对象是 JavaScript 原生的时间库。它以1970年1月1日00:00:00作为时间的零点，可以表示的时间范围是前后各1亿天(单位为毫秒)。

### 3.1 Date.now()
`Date.now`方法返回当前时间距离时间零点(1970年1月1日 00:00:00 UTC)的毫秒数，相当于 Unix 时间戳乘以1000
```js
Date.now(); // 1635216733395
```

### 3.2 时间戳
时间戳是指格林威治时间1970年01月01日00时00分00秒(北京时间1970年01月01日08时00分00秒)起至现在的总秒数。
格林威治和北京时间就是时区的不同.
Unix是20世纪70年代初出现的一个操作系统，Unix认为1970年1月1日0点是时间纪元。JavaScript也就遵循了这一约束。

## 4. get方法获取时间
`Date`对象提供了一系列`get`方法，用来获取实例对象某个方面的值:

| 实例方法get类         | 说明                           |
| :--------------- | :--------------------------- |
| getTime()        | 返回实例距离1970年1月1日00:00:00的毫秒数。 |
| getDate()        | 返回实例对象对应每个月的几号(从1开始)。        |
| getDay()         | 返回星期几，星期日为0，星期一为1，以此类推。      |
| getYear()        | 返回距离1900的年数。                 |
| getFullYear()    | 返回四位的年份。                     |
| getMonth()       | 返回月份(0表示1月，11表示12月)。         |
| getHours()       | 返回小时(0-23)。                  |
| getMiliseconds() | 返回亳秒(0-999)。                 |
| getMinutes()     | 返回分钟(0-59)。                  |
| getSeconds()     | 返回秒(0-59)。                   |

```js
var d = new Date('january6，2022');
d.getDate()     // 返回6
d.getMonth()    // 返回0
d.getYear()     // 返回122
d.getFu1lYear() // 返回2022
```

编写函数获得本年度剩余天数。
```js
function leftDays()
{
	var today = new Date();
	var endYear = new Date(today.getFullYear(), 11, 31, 23, 59, 59, 999);
	var msPerDay = 24 * 60 * 60 * 1000;
	
	return Math.round((endYear.getTime() - today.getTime()) / msPerDay);
}
```


# DOM
## 1. DOM介绍
DOM 是JavaScript 操作网页的接口，全称为“文档对象模型”(Document Object Model)。它的作用是将网页转为一个JavaScript 对象，从而可以用脚本进行各种操作(比如对元素增删内容)。

浏览器会根据 DOM 模型，将结构化文档HTML解析成一系列的节点，再由这些节点组成一个树状结构(DOMTree)。所有的节点和最终的树状结构，都有规范的对外接口。

DOM 只是一个接口规范，可以用各种语言实现。所以严格地说，DOM不是JavaScript语法的一部分，但是DOM 操作是JavaScript最常见的任务，离开了 DOM,JavaScript 就无法控制网页。另一方面，JavaScript也是最常用于 DOM 操作的语言。

## 2. 节点
DOM 的最小组成单位叫做节点(node)。
文档的树形结构(DOM 树)，就是由各种不同类型的节点组成。
每个节点可以看作是文档树的一片叶子。

节点的类型有7种：

| 节点类型             | 说明                        |
| ---------------- | ------------------------- |
| Document         | 整个文档树的顶层节点。               |
| DocumentType     | doctype标签。                |
| Element          | 网页的各种HTML标签。              |
| Attribute        | 网页元素的属性(比如class="right")。 |
| Text             | 标签之间或标签包含的文本。             |
| Comment          | 注释。                       |
| DocumentFragment | 文档的片段。                    |

## 3. 节点树
一个文档的所有节点，按照所在的层级，可以抽象成一种树状结构。
这种树状结构就是 DOM 树。
它有一个顶层节点，下一层都是顶层节点的子节点，然后子节点又有自己的子节点，就这样层层衍生出一个金字塔结构，倒过来就像一棵树。

浏览器原生提供`document`节点，代表整个文档。
```js
document  // 整个文档树
```

除了根节点，其他节点都有三种层级关系：
1. **父节点关系(parentNode)**：直接的那个上级节点。
2. **子节点关系(childNodes)**：直接的下级节点。
3. **同级节点关系(sibling)**：拥有同一个父节点的节点。


## 4. Node.nodeType属性
不同节点的nodeType属性值和对应的常量如下：

| 节点                       | 属性值 | 对应常量                        |
| ------------------------ | --- | --------------------------- |
| 文档节点(document)           | 9   | Node.DOCUMENTNODE           |
| 元素节点(element)            | 1   | Node.ELEMENT_NODE           |
| 属性节点(attr)               | 2   | Node.ATTRIBUTE NODE         |
| 文本节点(text)               | 3   | Node.TEXT_NODE              |
| 文档片断节点(DocumentFragment) | 11  | Node.DOCUMENT_FRAGMENT_NODE |

```js
document.nodeType // 9
document.nodeType === Node.DOCUMENT_NODE // true
```


# document对象方法
## 1. 获取元素
### 1.1 getElementsByTagName()
`document.getElementsByTagName()`方法搜索 HTML 标签名，返回符合条件的元素。
它的返回值是一个类似**数组对象**(HTMLcolection 实例)，可以实时反映 HTML 文档的变化。
如果没有任何匹配的元素，就返回一个空集。
```js
var paras = document.getElementsByTagName('p');
```
如果传入`*`，就可以返回文档中所有 HTML 元素。
```js
var allElements = document.getElementsByTagName('*');
```

### 1.2 getElementsByclassName()
`document.getElementsByclassName()`方法返回一个类似数组的对象(HTMLCollection实例)。
包括了所有 class 名字符合指定条件的元素，元素的变化实时反映在返回结果中。
```js
var elements = document.getElementsByClassName(names);
```
由于`class`是保留字，所以 JavaScript 一律使用`className`表示 CSS 的`class`参数可以是多个`class`，它们之间使用空格分隔。
```js
var elements = document.getElementsByClassName('foo bar');
```

### 1.3 getElementsByName()
`document.getElementsByName()`方法用于选择拥有`name`属性的 HTML 元素(比如 `<form>`、`<radio>`、`<img>`等)。
返回一个类似数组的的对象( `NodeList`实例)，因为`name`属性相同的元素可能不止一个。
```js
// 表单位 <form name="abcd"></form>
var forms = document.getElementsByName("abcd");
```

### 1.4 getElementByid()
 `document.getElementByid()`方法返回匹配指定`id`属性的元素节点。
 如果没有发现匹配的节点，则返回`null`。
```js
var elem = document.getElementByid("paral");
```
注意，该方法的参数是**大小写敏感**的。
比如，如果某个节点的`id`属性是`main`，邦么`document.getElementByld('Main')`将返回`null`。

### 1.5 quenyselector()
`document.quenyselector()`方法接受一个 CSS 选择器作为参数，返回匹配该选择器的元素节点。
如果有多个节点满足匹配条件，则返回**第一个**匹配的节点。
如果没有发现匹配的节点，则返回`null`。
```js
var el1 = document.quenyselector(".myclass");
```

### 1.6 queryselectorAll()
`document.queryselectorAll()`方法与`queryselector`用法类似，区别是返回一个`NodeList`对象，包含所有匹配给定选择器的节点。
```js
var elementList = document.queryselectorAll(".myclass");
```

### 1.7 getAttribute()
用于获取自定义属性的内容。

## 2. 创建元素
### 2.1 createElement()
`document.createElement()`方法用来生成元素节点，并返回该节点。
```js
var newDiv = document.createElement("div");
```

### 2.2 createTextNode()
`document.createTextNode()`方法用来生成文本节点(`Text`实例)，并返回该节点。
它的参数是文本节点的内容。
```js
var newDiv = document.createElement("div");
var newContent = document.createTextNode("Hello");
newDiv.appendChild(newContent);
```

### 2.3 createAtibute()
`document.createAtibute()`方法生成一个新的属性节点(`Attr`实例)，并返回它。
```js
var attribute = document.createAtibute(name);
```
```js
var root = document.getElementByid("root");
var it = document.createAttribute("itbaizhan");
it.value = "it";
root.setAttributeNode(it);
```


# Element对象
Element 对象对应网页的 HTML 元素。
每一个 HTML 元素，在 DOM 树上都会转化成一个 Element 节点对象(以下简称元素节点)。

## 1. Element属性
### 1.1 id
`Element.id`属性返回指定元素的`id`属性，该属性可读写。
```js
// HTML 代码为 <p id="foo">
var p = document.querySelector('p');
p.id; // 返回"foo"
```

### 1.2 className
`className`属性用来读写当前元素节点的`class`属性。
它的值是一个字符串，每个`class`之间用空格分割。
```js
 // HTML 代码 <div class="one two three" id="myDiv"></div>
 var div= document.getElementById('myDiv');
 div.className // 返回"one two three"
```

### 1.3 classList
`classList`对象有下列方法：
1. **add()**：增加一个`class`。
2. **remove()**：移除一个`class`。
3. **contains()**：检查当前元素是否包含某个`class`。
4. **toggle()**：将某个`class`移入或移出当前元素。
```js
var div = document.getElementById('myDiv');

div.classList.add("mycssclass");
div.classList.add("foo","bar");
div.classList.remove("mycssclass");
div.classList.toggle("mycssclass"); // 如果mycssclass 不存在就加入，否则移除
div.classList.contains("mycssclass"); // 返回 true 或者 false
```

### 1.4 innerHTML
`Element.innerHTML`属性返回一个字符串，等同于该元素包含的所有 HTML 代码。
该属性可读写，常用来设置某个节点的内容。
它能改写所有元素节点的内容，包括`<HTML>`和`<body>`元素。
```js
el.innerHTML = '';
```

### 1.5 innerText
`innerText`和`innerHTML`类似，不同的是`innerText`无法识别元素，会直接渲染成字符串。

## 2. Element获取元素位置


| 属性           |                          描述                           |
| ------------ | :---------------------------------------------------: |
| clientHeight |      获取元素高度包括`padding`部分，但是不包括`border`、`margin`       |
| clientWidth  |      获取元素宽度包括`padding`部分，但是不包括`border`、`margin`       |
| scrollHeight | 元素总高度，它包括`padding`，但是不包括 `border`、`margin`包括溢出的不可见内容。 |
| scrollwidth  | 元素总宽度，它包括`padding`，但是不包括`border`、`margin`包括溢出的不可见内容。  |
| scrollLeft   |                  元素的水平滚动条向右滚动的像素数量。                   |
| scrollTop    |                  元素的垂直滚动条向下滚动的像素数量。                   |
| offsetHeight |    元素的 CSS 垂直高度(单位像素)，包括元素本身的高度、`padding`和`border`    |
| offsetWidth  |    元素的 CSS 水平宽度(单位像素)，包括元素本身的高度、`padding`和`border`    |
| offsetLeft   |                     到定位父级左边界的间距。                      |
| offsetTop    |                     到定位父级上边界的间距。                      |

### 2.1 clientHeight 和 clientWidth
`Element.cientHeigh`属性返回一个整数值，表示元素节点的 CSS 高度(单位像素)，只对块级元素生效，对于行内元素返回0。如果块级元素没有设置 CSS 高度，则返回实际高度。
除了元素本身的高度，它还包括`padding`部分，但是不包括 `border`、`margin`。如果有水平滚动条，还要减去水平滚动条的高度。注意，这个值始终是整数，如果是小数会被四舍五入。
`Element.cientwidmh`属性返回元素节点的 CSS 宽度，同样只对块级元素有效，也是只包括元素本身的宽度和`padding`，如果有垂直滚动条，还要减去垂直滚动条的宽度。
`document.documentElement`的`clientHeigh`属性，返回当前视口的高度(即浏览器窗口的高度)。`document.body`的高度则是网页的实际高度。
```js
// 视口高度
document.documentElement.clientHeight
// 网页总高度
document.body.clientHeight
```

### 2.2 scrollHeight 和 scrollWidth
`Element.scrollHeight`属性返回一个整数值(小数会四舍五入)，表示当前元素的总高度(单位像素)，它包括`padding`，但是不包括`border`、`margin`以及水平滚动条的高度(如果有水平滚动条的话)。
`Element.scrolwidth`属性表示当前元素的总宽度(单位像素)，其他地方都与`scrolHeight`属性类似。这两个属性只读整张网页的总高度可以从`document.documentElement`或`document.body`上读取。
```js
// 返回网页的总高度
document.documentElement.scrollHeight
document.body.scro1lHeight
```

### 2.3 scrollLeft 和 scrollTop
`Element.scrolet`属性表示当前元素的水平滚动条向右侧滚动的像素数量，`Elemen.scrolTop`属性表示当前元素的垂直滚动条向下滚动的像素数量。对于那些没有滚动条的网页元素，这两个属性总是等于0。
如果要査看整张网页的水平的和垂直的滚动距离，要从`document.documentElement`元素上读取。
```js
document.documentElement.scrollLeft
document.documentElement.scrollTop
```

### 2.4 offsetHeight 和 offsetWidth
`Element.ofsetHeight`属性返回一个整数，表示元素的 CSS 垂直高度(单位像素)，包括元素本身的高度`padding`和`border`，以及水平滚动条的高度(如果存在滚动条)。
`Element.ofsetwidn`属性表示元素的 CSS 水平宽度(单位像素)，其他都与`Element.ofsetHeight`一致。
这两个属性都是只读属性，只比`Element.clientHeight`和`Element.clienwidth`多了边框的高度或宽度。如果元素的 CSS设为不可见(比如`display: none;`)，则返回0。

### 2.5 offsetLeft 和 offsetTop
`Element.ofsetLet`返回当前元素左上角相对于`Element.ofsetParent`节点的水平位移，`Element.ofsetTop` 返回垂直位移，单位为像素。
通常，这两个值是指相对于父节点的位移。


# CSS操作
## 1. HTML 元素的 styie 属性
操作 CSS 样式最简单的方法，就是使用网页元素节点的 `setAtribue`方法直接操作网页元素的`styie`属性。
```js
div.setAttribute(
	"style",
	"background-color:red;"+ "border:lpx solid black;"
	);
```

## 2. 元素节点的 style 属性
```js
var divstyle = document.queryselector("div").style;

divstyle.backgroundcolor = "red";
divstyle.border = "lpx solid black";
divstyle.width = "100px";
divstyle.height = "100px";
divstyle.fontsizer = "10em";
```

## 3. cssText属性
```js
var divstyle = document.queryselector('div').style;

divstyle.cssText = "background-color: red;"
	+ "border: 1px solid black;"
	+ "height: 100px;"
	+ "width: 100px;";
```


# 事件处理程序
事件处理程序分为：
1. HTML 事件处理。
2. DOM0级事件处理。
3. DOM2级事件处理。


## 1. HTML事件
缺点：JS 与 HTML 和 CSS 混合，不推荐。
```html
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="UTF-8">
		<title>JS事件详解--事件处理</title>
	</head>
	<body>
		<div>
			<tutton id="btn1" onclick="demo()">按钮</button>
		</div>
		<script>
			function demo()
			{
				alert("hello html事件处理");
			}
		</script>
	</body>
</html>
```

## 2. DOM0级事件
优点：JS 与 HTML 和 CSS 分离。
缺点：无法同时添加多个事件。
```js

<body>
	<div id="div">
		<button id="btn1">按钮</button>
	</div>
	<script>
		var btnl=document.getElementById("btn1");
		btn1.onclick=function(){alert("He110 DOM0级事件处理程序1");}//被覆盖掉
		btn1.onclick=function(){alert("He110 DOM0级事件处理程序2");}
	</script>
</body>
```

## 3. DOM2级事件
优点：事件不会被覆盖 。
缺点：写起来麻烦。
```html
<body>
	<div>
		<button id="btn1">按钮</button>
	</div>
	<script>
		var btnl=document.getElementById("btn1");
		btn1.addEventListener("click",demo1);
		btn1.addEventListener("click",demo2);
		btn1.addEventListener("click",demo3);
		function demo1()
		{
			alert("DoM2级事件处理程序1")
		}
		function demo2()
		{
			alert("DOM2级事件处理程序2")
		}
		function demo3()
		{
			alert("DOM2级事件处理程序3)
		}
		btn1.removeEventListener("click",demo2);
	</script>
</body>
```


# Event事件对象
事件发生以后，会产生一个事件对象，作为参数传递给监听函数。
## 1. Event对象属性
### 1.1 Event.target
`Event.target`属性返回事件当前所在的节点。
```js
// HTML代码为
//<p id="para">He11o</p>
function setcolor(e)
{
	console.log(this == eltarget);
	e.target.style.color ="red";
}

para.addEventListener("click", setcolor);
```

### 1.2 Event.type
`Event.type`属性返回一个字符串，表示事件类型。
事件的类型是在生成事件的时候。该属性只读。

### 1.3 Event.keyCode
`event.keyCode`属性返回按下按键的唯一数字标识。
可以用来实现按键功能。

## 2. Event对象方法
### 2.1 preventDefault()
`Event.preventDefault()`方法取消浏览器对当前事件的**默认行为**。
比如点击链接后，浏览器默认会跳转到另一个页面，使用这个方法以后，就不会跳转了。
```js
btn.onclick = function(e)
{
	e.preventDefault();//阻止默认事件
	console.1og("点击A标签");
}
```

### 3.2 stopPropagation()
`Event.stopPropagation()`方法阻止事件在 DOM 中**继续传播**，防止再触发定义在别的节点上的监听函数，但是不包括在当前节点上其他的事件监听函数。
简单点说就是当**子元素**被触发产生事件后，会继续触发上层的**父元素**的事件，就像冒泡一样不断向上。该方法就是用来阻止事件冒泡的。
```js
btn.onclick = function(e)
{
	e.stopPropagation(); // 阻止事件冒泡
	console.log("btn");
}
```


# 事件类型 on
注意：**这些事件方法在使用的时候，除了DOM2级事件，都需要添加前缀`on`。**

## 1. 鼠标事件
鼠标事件是指与鼠标操作相关的事件。
有以下10个事件：

| 鼠标事件       | 说明                              |
| ---------- | ------------------------------- |
| click      | 按下鼠标时触发。                        |
| dblclick   | 在同一个元素上双击鼠标时触发。                 |
| mousedown  | 按下鼠标键时触发。                       |
| mouseup    | 释放按下的鼠标键时触发。                    |
| mousemove  | 当鼠标在节点内部移动时触发。当鼠标持续移动时，该事件会连触发。 |
| mouseenter | 鼠标进入一个节点。时触发，进入子节点不会触发这个事件      |
| mouseleave | 鼠标离开一个节点时触发，离开父节点不会触发这个事件。      |
| mouseover  | 鼠标进入一个节点时触发，进入子节点会再一次触发这个事件。    |
| mouseout   | 鼠标离开一个节点时触发，离开父节点也会触发这个事件。      |
| wheel      | 滚动鼠标的滚轮时触发。                     |
举个例子：
```js
var btnl = document.getElementById("btn1");
btnl.onclick =function()
	{
		console.1og("click事件");
	}
```

## 2. 键盘事件
键盘事件由用户击打键盘触发，主要有：
1. **keydown**：按下键盘时触发。
2. **keypress**：按下有值的键时触发，即按下`Ctrl`、`Alt`、`Shift`、`Meta`这样无值的键，这个事件不会触发。对于有值的键，按下时先触发`keydawn`事件，再触发这个事件。
3. **keyup**：松开键盘时触发该事件。

```js
username.onkeypress = function(e)
{
	console.1og("keypress事件");
}
```

可以使用`event.keyCode`来获取按键的唯一数字标识。
```js
// 比如实现按下Enter键开始搜索功能。
var username =document.getElementById("username");

username.onkeydown = function(e)
{
	if(e.keycode === 13)
	{
		console.1og("回车");
	}
}
```

## 3. 表单事件
表单事件是在使用**表单元素及输入框元素**可以监听的一系列事件。

### 3.1 input事件
input事件当 `<input>`、`<select>`、`<textarea>`的值发生变化时触发。
对于复选框(`<input type=checkbox>`)或单选框(`<input` `type=radio>`)，用户改变选项时，也会触发这个事件。
input事件的一个特点，就是会连续触发，比如用户每按下一次按键，就会触发一次input事件。
```js
var username = document.getElementById("username");
username.oninput = function(e)
{
	console.1og(e.target.value);
}
```

### 3.2 select事件
select事件再`<input>`、`<textarea>`里面选中文本时触发。
```js
// HTML 代码如下
// <input id="test" type="text" value="select me!" />

var elem= document.getElementById("test");
elem.addEventListener("select",function(e)
{
	console.log(e.type); // "select'}，false);
}, false);
```

### 3.3 Change事件
Change事件当 `<inpu>`、`<selecp>`、`<textare>`的值发生变化时触发。
它与input事件的最大不同，就是不会连续触发，只有当**全部修改完成时**才会触发。
```js
var email = document.getElementById("email");
email.onchange = function(e)
{
	console.log(e.target.value);
}
```

### 3.4 reset 事件 和 submit 事件
这两个事件发生在表单对象`<form>`上，而不是发生在表单的成员上。
**reset 事件**：当表单重置(所有表单成员变回默认值)时触发。
**submit 事件**：当表单数据向服务器提交时触发。
注意，submit 事件的发生对象是`<form>`元素，而不是`<button>`元素，因为提交的是表单，而不是按钮。
```html
<form id="myForm" onsubmit="submitHandle">
	<button onclick="resetHandle">重置数据</button>
	<button>提交</button>
</form>
```
```js
var myForm = document.getElementById("myForm")
function resetHandle()
{
	myForm.reset;
}
function submitHandle()
{
	console.1og("提交");
}
```


# 事件代理
由于事件会在冒泡阶段向上传播到父节点，因此可以把子节点的监听函数定义在父节点上，由父节点的监听函数统一处理多个子元素的事件。
这种方法叫做事件的代理(delegation)。
```js
var ul = document.querySelector("ul");

ul.addEventListener("click", function(event)
{
	// toLowercase译为“转换为小写”。
	if (event.target.tagName.toLowercase() === "li"
	{
		// some code	
	}
});
```


# 定时器
JavaScript 提供定时执行代码的功能，叫做定时器(timer)，主要由`setTimeout()`和`setinterval()`这两个函数来完成。它们向任务队列添加定时任务。

## 1. setTimeout()
`setTimeout()` 函数用来指定某个函数或某段代码，在多少毫秒之后执行。
它返回一个整数，表示定时器的编号，以后可以用来取消这个定时器。
```js
var timerId = setTimeout(func|lcode, delay);
```
`setTimeout()`函数接受两个参数：
	第一个参数`unccode`是将要推迟执行的函数名或者一段代码。
	第二个参数`delay`是推迟执行的毫秒数。
```js
setTimeout(function()
{
	console.1og("定时器");
}, 1000);
```

注意：
	还有一个需要注意的地方，如果回调函数是**对象的方法**，那么 `setTmeout()`使得方法内部的`this`关键字指向**全局环境**，而不是定义时所在的那个对象。
举个例子：
```js
var name = "sxt";
var user = {
	name:"itbaizhan",
	getName:function()
	{
		setTimeout(function()
		{
			console.log(this.name);
		},1000)
	}
};
user.getName();
```
解决方案：
```js
var name = "sxt";
var user = {
	name:"itbaizhan",
	getName:function()
	{
		var that = this; // 添加了这段。
		setTimeout(function()
		{
			console.log(that.name); // 将this替换。
		},1000)
	}
};
user.getName();
```

定时器可以取消
```js
var id = setTimeout(f, 1000);
clearTimeout(id);
```

## 2. setlnterval()
`setinterval()`函数的用法与`setTimeout()`完全一致，区别仅仅在于`setinterval`指定某个任务每隔一段时间就执行一次，也就是**无限次**的定时执行。
```js
var timer = setInterval(function()
{
	console.1og(2);
}, 1000)
```

通过setInterval方法实现网页动画。
```html
<style>
	#someDiv{
	width: 100px;
	height: 100px;
	background: red;
	}
</style>

<body>
	<div id="someDiv"></div>
	<script>
	vardiv=document.getElementById("someDiv");
	var opacity = 1;
	var fader = setInterval(function()
	{
		opacity -= 0.05;
		if(opacity > 0)
		{
			div.style.opacity = opacity;
		}
		else 
		{
			clearInterval(fader);
		}, 30);
	}
	</script>
</body>
```

定时器可以进行取消
```js
var id = setInterval(f，1000);
clearInterval(id);
```


# JS优化 - 防抖(debounce)
防抖严格算起来应该属于性能优化的知识，但实际上遇到的频率相当高，处理不当或者放任不管就容易引起**浏览器卡死**。

从滚动条监听的例子说起
```js
function showTop()
{
	var scrollTop = document.documentElement.scrollTop;
	console.1og("滚动条位置:"+ scro11Top);
}
window.onscro1l = showTop
```
在运行的时候会发现存在一个问题:这个函数的默认执行频率，太!高!了!。高到什么程度呢?以chrome为例，我们可以点击选中一个页面的滚动条，然后点击一次键盘的【向下方向键】，会发现函数执行了8-9次!

然而实际上我们并不需要如此高频的反馈，毕竟浏览器的性能是有限的，不应该浪费在这里，所以接着讨论何优化这种场景。
首先提出第一种思路：
	在第一次触发事件时，不立即执行函数，而是给出一个期限值比如基于上述场景，200ms，然后
		1. 如果在200ms内没有再次触发滚动事件，那么就执行函数。
		2. 如果在200ms内再次触发滚动事件，那么当前的计时取消，重新开始计时。
效果:如果短时间内大量触发同一事件，只会执行一次函数。

实现：
	既然前面都提到了计时，那实现的关键就在于`setTimeout()`这个函数，由于还需要一个变量来保存计时，考虑维护全局纯净，可以借助闭包来实现。
```js
function debounce(fn, delay)
{
	let timer = null //借助闭包
	return function()
	{
		if(timer)
		{
			clearTimeout(timer);
		}
		timer=setTimeout(fn,delay)// 简化写法		
	}
}

// 引入上面的代码。
function showTop()
{
	var scrollTop = document.documentElement.scrollTop;
	console.1og("滚动条位置:"+ scro11Top);
}
window.onscro1l = showTop

```
到这里，已经把防抖实现了。

防抖定义：
	对于短时间内连续触发的事件(上面的滚动事件)，防抖的含义就是让某个时间期限(如上面的1000毫秒)内，事件处理函数只执行一次。


# JS优化 - 节流(throttle)
节流严格算起来应该属于性能优化的知识，但实际上遇到的频率相当高，处理不当或者放任不管就容易引起**浏览器卡死**。

继续思考，使用上面的防抖方案来处理问题的结果是：
	如果在限定时间段内，不断触发滚动事件(比如某个用户闲着无聊，按住滚动不断的拖来拖去)，只要不停止触发，理论上就永远不会输出当前距离顶部的距离。
	但是如果产品同学的期望处理方案是:即使用户不断拖动滚动条，也能在某个时间间隔之后给出反馈呢?
	其实很简单：我们可以设计一种类似控制阀门一样定期开放的函数，也就是让函数执行一次后，在某个时间段内暂时失效，过了这段时间后再重新激活(类似于技能冷却时间)
	效果：如果短时间内大量触发同一事件，那么在函数执行一次之后，该函数在指定的时间期限内不再工作，直至过了这段时间才重新生效。

**实现**
这里借助`setTimeout`来做一个简单的实现，加上一个状态位`valid`来表示当前函数是否处于工作状态。
```js
function throttle(fn, delay){
	let valid = true
	return function() 
	{
		if(!valid)
		{   // 休息时间 暂不接客
			return false
		}
		//工作时间，执行函数并且在间隔期内把状态位设为无效
		valid = false
		setTimeout(function()
		{
			fn()
			valid = true;
		}, delay)
	}
}

function showTop()
{
	var scrollTop = document.documentElement.scrollTop;
	console.log("滚动条位置:" + scro1lTop);
}
window.onscro1l = throttle(showTop, 300);
```

如果一直拖着滚动条进行滚动，那么会以300ms的时间间隔，持续输出当前位置和顶部的距离。
讲完了这两个技巧，下面介绍一下平时开发中常遇到的场景：
	1. **搜索框input事件**：例如要支持输入实时搜索可以使用节流方案(间隔一段时间就必须查询相关内容)，或者实现输入间隔大于某个值(如500ms)，就当做用户输入完成，然后开始搜索，具体使用哪种方案要看业务需求。
	2. **页面resize事件**：常见于需要做页面适配的时候。需要根据最终呈现的页面情况进行dom渲染(这种情形-般是使用防抖，因为只需要判断最后一次的变化情况)。



