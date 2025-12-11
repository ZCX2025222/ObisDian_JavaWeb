 CSS(层叠样式表)
 相当于皮肤。
 
---
[CSS 教程 | 菜鸟教程](https://www.runoob.com/css/css-tutorial.html)

# CSS引入方式

|       引入方式       |                  书写位置                  | 作用范围 |  使用场景  |
| :--------------: | :------------------------------------: | :--: | :----: |
| [[#1.内嵌式：\|内嵌式]] |           CSS写在\<style>标签中。            | 当前页面 |  小案例   |
| [[#2.外联式\|外联式]]  | CSS写在一个单独的.css文件中，需要通过\<link>标签在网页中引入。 | 多个页面 |  项目中   |
| [[#3.行内式\|行内式]]  |        CSS写在标签的\<style>属性中，不推荐。        | 当前页面 | 配合js使用 |

## 1.内嵌式
```html                                                                                  
<style>                  
	div{        
		background-color: rgb(0, 255, 38); --- 设置p段落背景为绿色。
	}
</style>

<body>                      
    <div>      
        <p>这是内嵌式</p> 
    </div>      
</body>      
```

## 2.外联式
```css
div{background-color: rgb(0, 255, 38);}            
```
```html
<head>  
	<link rel="stylesheet" href="验证.css">  
</head>  

<body>  
    <div>  
        <p>这是外联式</p> --- 该字段背景变绿。
    </div>  
</body>  
```

## 3.行内式
```html
<body>
    <div style="background-color: rgb(0, 255, 38);">
        <p>这是行内式</p>
    </div>
</body>
```


---

# CSS基础选择器

|          选择器          |           语法            |   说明    |
| :-------------------: | :---------------------: | :-----: |
|  [[#1.标签选择器\|标签选择器]]  |   标签名 { css属性名：属性值； }   |         |
|   [[#2.类选择器\|类选择器]]   |   .类名 { css属性名：属性值； }   |   最常用   |
|  [[#3.id选择器\|id选择器]]  | \#id属性值 { css属性名：属性值； } |         |
| [[#4.通配符选择器\|通配符选择器]] |    * { css属性名：属性值； }    | 开发中极少用到 |

## 1. 标签选择器
结构：标签名{css属性：属性;}，如：
```css
div{
    color:"blue"; --- 把三个div标签里的文字颜色设置为蓝色
}

<div>第一个div</div>
<div>第二个div</div>
<div>第三个div</div>
```
作用：通过标签名，找到页面中所有这类标签，设置样式。
注意：
1. 标签选择器选择的是**一类标签**，而不是单独某一个。
2. 标签选择器无论嵌套关系有多深，**都能找到**对应的标签。


## 2. 类选择器
结构：.类名 { css属性名：属性值； }，如：
```css
.brown{
    color:brown; --- 把第一个div和第二个p标签包含的文字颜色设置为红色，
    				因为都带有：class="brown"属性。			
}

    <div class="brown">第一个div</div>
    <div>第二个div</div>
    <p class="blue">第一个p</p>
    <p class="brown">第二个p</p>
```
作用：通过类名，找到页面中所有带有这个类名的标签，设置样式。
注意点：
1. 所有标签上都有class属性，class属性的属性值称为类名（类似于名字）。
2. 类名可以由数字、字母、下划线、中划线组成，但不能以数字或者中划线开头。
3. 一个标签可以同时有多个类名，类名之间以空格隔开。
4. 类名可以重复，一个类选择器可以同时选中多个标签。



## 3. id选择器
结构：#id属性值 { css属性名：属性值； }，如：
```css
#a{
    color:blue; --- 把带属性：id="a"的标签包含的文字颜色设置为蓝色，原理和类选择器一样。
}

    <div id="a" >第一个div</div>
    <div id="div">第二个div</div>
    <div id="a">第三个div</div>
    <p id="a">第一个p</p>
    <p id="p">第二个p</p>
```
作用：通过id属性值，找到页面中带有这个id属性值的标签，设置样式。
注意点：
1. 所有标签上都有id属性。
2. id属性值类似于身份证号码，**在一个页面中是唯一的**，不可重复的！
3. 一个标签上只能有一个id属性值。
4. 一个id选择器只能选中一个标签。


## 4. 通配符选择器
结构：* { css属性名：属性值； }，如：
```css
效果是设置界面中所有的标签样式，一般用来去除界面的默认样式。
*{
    color:blue;
}
```
作用：找到页面中所有的标签，设置样式。
注意点：
- 开发中使用极少，只会在极特殊情况下才会用到。
- 比如用来去除界面的默认样式。



---

# CSS字体和文本样式
## 1. 字体大小 size
属性名：**font-size**
取值：数字 + px
注意点：
- 谷歌浏览器默认文字大小是16px。
- 单位需要设置，否则无。


## 2. 字体粗细 weight
属性名：**font-weight**

| 取值          | 说明             |
| ----------- | -------------- |
| normal      | 正常（400）        |
| bold        | 加粗（700）        |
| 100~900的整百数 | 取数字。数字越大，文字越粗。 |
注意点：
- 不是所有字体都提供了九种粗细，因此部分取值页面中无变化。

- 实际开发中以：正常、加粗两种取值使用最多。


## 3.  字体样式（是否倾斜）style
属性名：**font-style**

| 取值     | 说明      |
| ------ | ------- |
| normal | 正常（默认值） |
| italic | 倾斜      |

## 4. 字体系列(没用过) family
属性名：**font-family**
常见取值：具体字体1,具体字体2,具体字体3,具体字体4,...,字体系列
- 具体字体："Microsoft  YaHei"、微软雅黑、黑体、宋体、楷体等……
- 字体系列：sans-serif、serif、monospace等……

如：
```css
div{
	font-family:"Microsoft  YaHei",微软雅黑,黑体,宋体,楷体
}
```

渲染规则：
1. 从左往右按照顺序查找，如果电脑中未安装该字体，则显示下一个字体。
2. 如果都不支持，此时会根据操作系统，显示最后字体系列的默认字体。

注意点：
1. 如果字体名称中存在多个单词，推荐使用引号包裹。
2. 最后一项字体系列不需要引号包裹。
3. 网页开发时，尽量使用系统常见自带字体，保证不同用户浏览网页都可以正确显示。


## 5. 样式的层叠问题
问题：
- 给同一个标签设置了相同的样式，此时浏览器会如何渲染呢？

结果：
- **如果给同一个标签设置了相同的属性，此时样式会层叠（覆盖），写在最下面的会生效。**

TIP：
•CSS （Cascading style sheets） 层叠样式表
•所谓的层叠即叠加的意思，表示样式可以一层一层的层叠覆盖

## 6. 字体font相关属性的连写
属性名：**font (复合属性)**
取值：
- font : style weight size family;

省略要求：
- 只能省略前两个，如果省略了相当于设置了默认值。

注意点：如果需要同时设置**单独和连写**形式
- 要么把单独的样式写在连写的下面。
- 要么把单独的样式写在连写的里面。


## 7. 文本缩进 indent
属性名：**text-indent**

| 属性值       | 说明                      |
| --------- | ----------------------- |
| 数字+px     | 以像素为单位进行缩进              |
| 数字+em（推荐） | 1em = 当前标签的font-size的大小 |

## 8. 文本水平对齐方式 align
属性名：**text-align**

|  属性值   |  效果  |
| :----: | :--: |
|  left  | 左对齐  |
| center | 居中对齐 |
| right  | 右对齐  |
注意点：
- 如果需要让文本水平居中，**text-align属性**要设置在目标文本所在的**父标签**中。


## 水平居中方法作用范围text-align : center
text-align : center 能让哪些元素水平居中？
1. 文本。
2. span标签、a标签。
3. input标签、img标签。

注意点：
- 如果需要让以上元素水平居中， text-align : center 需要给以上元素的**父元素**设置。


## 文本修饰 decoration
属性名：**text-decoration**
取值：

| 属性值          | 效果        |
| ------------ | --------- |
| underline    | 下划线（常用）   |
| line-through | 删除线（不常用）  |
| overline     | 上划线（几乎不用） |
| none         | 无装饰线（常用）  |

注意点：
- 开发中会使用 **text-decoration : none** ; 清除a标签默认的下划线。


## 文本行高 height
作用：控制一行的上下行间距。
属性名：**line-height**
取值：
- 数字+px
- 倍数（当前标签font-size的倍数）


应用：
1. 让单行文本**垂直居中**可以设置 line-height : 文字父元素高度。
2. 网页精准布局时，会设置 line-height : 1 可以**取消上下间距**。


行高与font连写的注意点：
- 如果同时设置了行高和font连写，注意覆盖问题。
- font :  style  weight  size/line-height  family


## 标签水平居中方法总结 margin :  0 auto
如果需要让div、p、h（大盒子）水平居中？
- 可以通过margin : 0 auto ; 实现。

注意点：
1. 如果需要让 div、p、h（大盒子） 水平居中，直接给 **当前元素本身** 设置即可。
2. margin：0 auto 一般针对于固定宽度的盒子，如果大盒子没有设置宽度，此时会默认占满父元素的宽度。




---

# CSS复合选择器(进阶)
## 1.  后代选择器 空格
选择器语法：选择器1 选择器2 选择器n{css}
```css
bodu div p{css}
```
作用：
- 根据 HTML 标签的嵌套关系，选择父元素 后代中 满足条件的元素。

举个例子：
```css
如：
<style>
    body div p {
        color: aqua; /*结果是body下的div的所有p标签被赋予蓝色属性
        				就是“这是2级标签”和“这是3级标签”在网页中会显示蓝色。*/
    }
</style>

<body>
    <p>这是1级标签</p>
    <div>
        <p>这是2级标签</p> /*显示蓝色*/
        <div>
            <p>这是3级标签</p> /*显示蓝色*/
        </div>
    </div>
</body>
```
结果：在选择器1所找到标签的后代(儿子、孙子、重孙子.)中，找到满足选择器2的标签，设置样式。
注意点：
1. 后代包括：儿子、孙子、重孙子……
2. 后代选择器中，选择器与选择器之前通过 **空格** 隔开。



## 2.子代选择器 >
选择器语法：选择器1>选择器2>选择器n{css}
```css
bodu>div>p{css}
```
作用：
- 根据 HTML 标签的嵌套关系，选择父元素 **子代中** 满足条件的元素。

举个例子：
```css 
如：
 body>div>p{
        color: aqua; /*结果是body标签下的div标签中，仅p标签被赋予蓝色属性，对更深层的div标签无效    				    就是“这是2级标签”在网页中会显示蓝色。*/
    }

<body>
    <p>这是1级标签</p>
    <div>
        <p>这是2级标签</p> /*显示蓝色*/
        <div>
            <p>这是3级标签</p>
        </div>
    </div>
</body>
```
结果：
- 在选择器1所找到标签的子代(儿子)中，找到满足选择器2的标签，设置样式。

注意：
1. 子代只包括：儿子。
2. 选择器于选择器之间用 **>** 隔开。


## 3. 并集选择器 ,
选择器语法：选择器1, 选择器2, 选择器n{css}
```css
.p1,div,a{css}
```
作用：同时选择多组标签，设置相同的样式。
举个例子：
```css
如：
/*类选择器和标签选择器混合使用*/
.p1,div,a{
    color: aqua; /*结果是带p1类名和div、a标签都被赋予蓝色属性。*/
}

<body>
    <p class="p1">这是p标签1</p> /*显示蓝色*/
    <p>这是p标签2</p>
    <div>
        这是div标签 /*显示蓝色*/
    </div>
    <a href="#">这是超链接标签</a> /*显示蓝色*/
</body>
```
结果：
- 带p1类名和div、a标签都被赋予蓝色属性。


注意点：
1. 并集选择器中的每组选择器之间通过 **,** 分隔。
2. 并集选择器中的每组选择器可以是基础选择器或者复合选择器。
3. 并集选择器中的每组选择器通常一行写一个，提高代码的可读性。


## 4. 交集选择器 紧挨着
选择器语法：选择器1选择器2选择器n{ css }
```css
div.a{css}
```
作用：选中页面中 **同时满足** 多个选择器的标签。
结果：
- （既又原则）找到页面中 **既** 能被选择器1选中，**又** 能被选择器2选中的标签，设置样式。


举个列子：
```html
 <style>
        div#div{
           color: rgb(255, 0, 0);
        }
 </style>

<body>
    <div id="a" >第一个div</div>
    <div id="div">第二个div</div> --- 变红
    <div id="a">第三个div</div>
    <p id="a">第一个p</p>
    <p id="p">第二个p</p>
</body>
```
结果：
- 这里选择既能能够被 div类选择选择器 选中，又能够被 id="div"的id选择器 选中的”第二个div“，将其文字变红 。 


注意点：
1. 交集选择器中的选择器之间是**紧挨着的**，没有东西分隔。
2. 交集选择器中如果有**标签选择器**，标签选择器必须写在最前面。


## 5. 属性选择器 E\[attr]
场景：通过元素上的**HTML属性**来选择元素，常用于选择 input 标签。
选择器语法：

|     选择器语法      |               功能                |
| :------------: | :-----------------------------: |
|    E\[attr]    |       选择具有 attr 属性的 E 元素。       |
| E\[attr="val"] | 选择具有 attr 属性并且属性值等于 val 的 E 元素。 |

举个例子：
```html
<style>
	/* 选择p标签中具有class属性并且属性值为“a”的元素 */
	p[class="a"]{
		color: aqua;
	}
</style>

<body>
    <p class="a">第一个p标签</p>  <!-- 字体变蓝 -->
    <p class="b">第二个p标签</p>
    <p class="a">第三个p标签</p>  <!-- 字体变蓝 -->
    <p class="c">第四个p标签</p>
</body>
```


## 6. 相邻兄弟选择器 +
作用：使用 `+` 符号连接两个选择器，选择**紧跟在第一个元素后面的第一个兄弟元素**。
选择器语法：**前一个元素 + 目标元素{}**
特性：
- **严格相邻要求**：前一个元素必须与目标元素紧紧相邻。
- **必须是兄弟关系**：两个元素必须有相同的父元素。
- **只能向后选择**。


举个例子：
```html
<style>
	div{
		width: 100px;
		height: 50px;
		background-color:aqua;
		display: none; /* 把div盒子设置为：隐藏，不占空间 */
	}
	
	/* 将按钮与div进行“绑定”，当按下按钮时，盒子显示 */
	input:active + div{
		display: block; 
	}
</style>

<body>
    <input type="button" value="点我显示">
    <div>
        我显示了
    </div>
</body>
```



## 7. 通用兄弟选择器 ~
作用：使用 `~` 符号连接两个选择器，选择**第一个元素后面的所有符合条件的兄弟元素**。
选择器语法：第一个元素 ~ 目标元素{CSS}
特性：
1. 选择**所有**符合条件的后续兄弟。
2. **两个元素必须是同级关系。**
3. **不需要紧邻**：与相邻兄弟选择器不同，通用兄弟选择器不要求元素紧邻。
4. **只向后选择。**


```html
<style>
	div{
		width: 100px;
		height: 50px;
		background-color:aqua;
	}
	
	/* 选择input按钮后的所有div标签 */
	input:active ~ div{
		background-color:aquamarine;
	}
</style>

<body>
    <input type="button" value="点我变色">
    
    <div>我是兄弟1</div>
    <div>我是兄弟2</div>
    <div>我是兄弟3</div>
    <div>我是兄弟4</div>
</body>
```



# emmet语法
作用：通过简写语法，快速生成代码。

| 标签名        | 示例           | 效果                                           |
| ---------- | ------------ | -------------------------------------------- |
| 标签名        | div          | \<div>\</div>                                |
| 类选择器       | .red         | \<div class="red">\</div>                    |
| id选择器      | \#one        | \<div id="one">\</div>                       |
| 交集选择器      | p.red#one    | \<p class=red" id="one">\</p>                |
| 子代选择器      | ul>li        | \<ul>\<li>\</li>\</ul>                       |
| 内部文本       | ui>li{li的内容} | \<ul>\<li>li的内容\</li>\</ul>                  |
| 创建多个（比如表格） | ul>li*3      | \<ul>\<li>\</li>\<li>\</li>\<li>\</li>\</ul> |

---

# CSS背景
## 1. 背景颜色 color
作用：设置背景颜色。
属性名：**background-color（bgc）**
属性值：
- 颜色取值：关键字、rgb表示法、rgba表示法、十六进制……

```css
<style>
   div{
	background-color: black; --- 关键字法，黑色。
	background-color:rgb(255, 0, 0); --- rgb表示法，红色。
	background-color: rgba(red, green, blue, alpha); 
	background-color: #ffffff;
}
</style>
```
注意点：
- 背景颜色默认值是**透明**： rgba(0,0,0,0) 、transparent。
- 背景颜色不会影响盒子大小，并且还能看清盒子的大小和位置，一般在布局中会习惯先给盒子设置背景颜色。

关于**rgba**取值法：
1. red、green、blue表示红、绿、蓝三原色。
2. 三者都取0-255的整数或0%-100%的百分比。
3. **alpha表示透明度**，0.0（完全透明）到1.0（完全不透明）之间的小数。


## 2. 背景图片 image
作用：为背景添加图片。
属性名：**background-image（bgi）**
```css
**background-image:value;
```
属性值：url("图片路径")
```css
div{
	background-image:url("图片路径");
	width: 1000px; --- 记得为图片设置显示尺寸。
	height: 1000px;
    }
```
注意点：
- 背景图片中url中可以省略引号。
- 背景图片默认是在水平和垂直方向平铺的。
- 背景图片仅仅是指给盒子起到装饰效果，类似于背景颜色，是**不能撑开盒子的**。


## 3. 背景平铺 repeat
属性名：**background-repeat（bgr）**

|    属性值    |        效果        |
| :-------: | :--------------: |
|  repeat   | （默认值）水平和垂直方向都平铺。 |
| no-repeat |       不平铺。       |
| repeat-x  |  沿着水平方向（x轴）平铺。   |
| repeat-y  |  沿着垂直方向（y轴）平铺。   |

## 4. 背景位置 position
作用：用于设置背景图像在元素中的起始位置。
属性名：**background-position（bgp）**
```css
background-position: value;
```
属性取值分为：方位名词取值 、百分比取值 和 数字+px取值。
1. 方位名词取值：

| 属性值    | 类型   | 效果  |
| ------ | ---- | --- |
| left   | 水平方向 | 左   |
| center | 水平方向 | 中   |
| right  | 水平方向 | 右   |
| top    | 垂直方向 | 上   |
| center | 垂直方向 | 中   |
| bottom | 垂直方向 | 下   |
```css
如：
	background-position: right bottom; --- 图片在右下角。
```
注意：若只取一个方向的值，则另一个方向默认为center

2. 百分比取值：

	1. 以所在容器的**左上角**为原点。
	2. 取值范围：0%~100%
	3. 计算公式：**（背景位置 - 背景图片尺寸）x 百分比**
	```css
	background-position: 水平百分比 垂直百分比;
	
	如：
		background-position: 100% 100%; --- 图片在右下角。
	```


3. 数字+px（坐标）取值：
	以所在容器的**左上角**为原点。
```css
background-position: 水平位置 垂直位置

如：
	background-position: 20px 30px; --- 左上偏移。
	background-position: 50px center; --- 可混合使用。
```

## 5. 背景相关属性连写（没用过）
属性名：**background（bg）**
属性值：
- 单个属性值的合写，取值之间以**空格**隔开。

书写顺序：
- 推荐：background：color image repeat position

省略问题：
1. 可以按照需求省略。
- 特殊情况：在pc端，如果盒子大小和背景图片大小一样，此时可以直接写 background：url()。

注意点：
1. 如果需要设置单独的样式和连写。
2. 要么把单独的样式写在连写的下面。
3. 要么把单独的样式写在连写的里面。


## 6. img标签和背景图片的区别
img标签是一个标签，不设置宽高默认会以原尺寸显示。
div标签 + 背景图片：
- 需要设置div的宽高，因为背景图片只是装饰的CSS样式，**不能撑开**div标签。



---

# CSS元素显示模式
## 块级元素
显示特点：
1. 独占一行（一行只能显示一个）。
2. 宽度默认是父元素的宽度，高度默认由内容撑开。
3. 可以设置宽高。


代表标签：
- **div、p、h系列**、ul、li、dl、dt、dd、form、header、nav、footer……


## 行内元素
显示特点：
1. 一行可以显示多个。
2. 宽度和高度默认由内容撑开。
3. 不可以设置宽高。


代表标签：
- **a、span**  、b、u、i、s、strong、ins、em、del……


## 行内块元素
显示特点：
1. 一行可以显示多个。
2. 可以设置宽高。


代表标签：
- input、textarea、button、select……
- 特殊情况：img标签有行内块元素特点，但是Chrome调试工具中显示结果是inline 。


## 元素显示模式转换 display
目的：改变元素默认的显示特点，让元素符合布局要求。
语法如下：

| 属性                    | 效果      | 使用频率 |
| --------------------- | ------- | ---- |
| display: block        | 转换成块级元素 | 较多   |
| display: inline-block | 转换行内块元素 | 较多   |
| display: inline       | 转换成行内元素 | 极少   |

## HTML嵌套规范注意点
注意点：
1. 块级元素一般作为大容器，可以嵌套：文本、块级元素、行内元素、行内块元素等等……
2. 但是：p标签中不要嵌套**div、p、h**等块级元素。
3. a标签内部可以嵌套任意元素。
4. 但是：a**标签不能嵌套a标签**。



---

# CSS三大特性
## 继承性
特性：子元素有默认继承父元素样式的特点（子承父业）
可以继承的常见属性(**文字控制属性都可以继承**)：
1. color
2. font-style、font-weight、font-size、font-family
3. text-indent、text-align
4. line-height
5. …….

注意点：
- 可以通过浏览器的**调试工具**判断样式是否可以继承。
- 如果属性显示成**淡灰色**，则表示该样式**不能继承**。
- 如果属性显示成**高亮**，则表示该样式**可以继承**。

好处：可以在一定程度上减少代码。

继承失效的特殊情况：
- 如果元素有浏览器**默认样式**，此时继承性依然存在，但是优先显示浏览器的默认样式。


## 层叠性
特性：
1. 给同一个标签设置**不同的样式** → 此时样式会层叠叠加 → 会**共同作用**在标签上。
2. 给同一个标签设置**相同的样式** → 此时样式会层叠覆盖 → 最终写在**最后的样式**会生效。

注意点：
- 当样式冲突时，只有当选择器优先级相同时，才能通过层叠性判断结果。


## 优先级
### 1. 优先级的介绍
特性：
- 不同选择器具有不同的优先级，优先级高的选择器样式会覆盖优先级低选择器样式。

优先级公式：
- 继承 < 通配符选择器 < 标签选择器 < 类选择器 < id选择器 < 行内样式 < !important

注意点：
1. !important写在属性值的后面，分号的前面！
2. !important不能提升继承的优先级，**只要是继承优先级最低！**
3. 实际开发中不建议使用 !important 。


### 2. 权重叠加计算
场景：如果是**复合选择器**，此时需要通过权重叠加计算方法，判断最终哪个选择器优先级最高并生效。
权重叠加计算公式：（每一级之间不存在进位）
	![[assets/图片/CSS/权重叠加计算.png]]

比较规则：
1. 先比较第一级数字，如果比较出来了，之后的统统不看
2. 如果第一级数字相同，此时再去比较第二级数字，如果比较出来了，之后的统统不看
3. 如此进行。
4. 如果最终所有数字都相同，表示优先级相同，则比较层叠性（谁写在下面，谁说了算!）

注意点：!important 如果不是继承，则权重最高，天下第一！


---

# CSS伪元素(看不懂)

伪元素：一般页面中的非主体内容可以使用伪元素。

区别：
1. 元素：HTML 设置的标签。
2. 伪元素：由 CSS 模拟出的标签效果。

常用的伪元素：

| 伪元素      | 作用                  |
| -------- | ------------------- |
| ::before | 在父元素内容的最前面添加一个伪元素。  |
| ::after  | 在父元素内容的最后 面添加一个伪元素。 |

注意点：
1. 必须设置**content属性**才能生效。
2. 伪元素默认是**行内元素**。
3. 伪元素必须紧跟在选择器之后，并且一个选择器中只能使用一个伪元素。



---

# CSS布局  - 标准流
标准流：又称**文档流**，是浏览器在渲染显示网页内容时默认采用的一套排版规则，规定了应该以何种方式排列元素。

常见标准流排版规则：
1. 块级元素：从上往下，**垂直布局**，独占一行。
2. 行内元素 或 行内块元素：从左往右，**水平布局**，空间不够自动折行。



---

# CSS布局 - 盒子模型
## 1. 盒子模型介绍
1\. 盒子的概念：
1. 页面中的每一个标签，都可看做是一个 “盒子”，通过盒子的视角更方便的进行布局。
2. 浏览器在渲染（显示）网页时，会将网页中的元素看做是一个个的矩形区域，我们也形象的称之为 盒子 。

3\. 盒子模型
- CSS  中规定每个盒子分别由：**内容区域（content）**、**内边距区域（padding）**、**边框区域（border）**、**外边距区域**（**margin**）构成，这就是 盒子模型 。

![[assets/图片/CSS/包装盒.png]]
![[assets/图片/CSS/盒子模型.png]]

## 2. 内容区域的的宽高
作用：利用 **width** 和 **height** 属性设置盒子的默认 **内容区域** 的大小。
属性：width / height
常见取值：数字+px
```


```

## 3. 边框 border
注意：四个边框是梯形，边框之间以45度角度的线相接。
属性名：**border**
快捷键：bd
连写属性值：
- 单个取值的连写，取值之间以空格隔开

	如：border : 10px solid red;

**1\. border单个设置属性时，属性值如下：**
属性名格式：border-属性名词: 属性名词的属性值;

| 属性名          | 属性值                                                           | 作用   |
| ------------ | ------------------------------------------------------------- | ---- |
| border-width | 数字+px                                                         | 边框粗细 |
| border-style | 实线：solid<br>虚线：dashed<br>点线：dotted<br>无边框：none<br>隐藏边框：hidden | 边框样式 |
| border-color | 颜色取值                                                          | 边框颜色 |
如：
```css
div{
	border-width: 5px;
}
```

**2\. border也可以单独为某个方向设置边框**：
属性名格式：border - 方位名词：连写属性;

| 属性值           | 方向  |
| ------------- | --- |
| border-top    | 上边框 |
| border-bottom | 下边框 |
| border-left   | 左边框 |
| border-right  | 右边框 |
或四面边框：dotted
如：
```css
div{
	border-bottom: 5px solid #000000;
}
```

**3\. border还可以将属性名词和方位名词组合起来进行更精细的设置：**
属性名格式：border-方位名词-属性名词:属性名词的样式值；
如：
```css
div{
	 border-bottom-style：solid;
	 border-bottom-width: 5px;
}
```

## 4. 内边距 padding
作用：设置 边框 与 内容区域 之间的距离。
属性名：**padding**
常见取值：

| 取值  | 示例                            | 含义                                                           |
| --- | ----------------------------- | ------------------------------------------------------------ |
| 一个值 | padding: 10px;                | **上下左右**都设置为10px                                             |
| 两个值 | padding: 10px 20px;           | **上下**设置为10px<br>**左右**设置为20px                               |
| 三个值 | padding: 10px 20px 30px;      | **上**设置为10px<br>**左右**设置为20px<br>**下**设置为30px                |
| 四个值 | padding: 10px 20px 30px 40px; | **上**设置为10px<br>**右**设置为20px<br>**下**设置为30px<br>**左**设置为40px |
记忆规则：**从上开始赋值，然后顺时针赋值，如果设置赋值的，看对面的！！**

内边距（padding）**单方向**设置：
	和边框单方向设置一样。
	属性名格式：padding-方位名词
	属性值：数字+px

## 5. 外边距 margin
作用：设置边框以外，盒子与盒子之间的距离。
属性名：**margin**
常见取值（和内边距一样）：

| 取值  | 示例                            | 含义                                                           |
| --- | ----------------------------- | ------------------------------------------------------------ |
| 一个值 | padding: 10px;                | **上下左右**都设置为10px                                             |
| 两个值 | padding: 10px 20px;           | **上下**设置为10px<br>**左右**设置为20px                               |
| 三个值 | padding: 10px 20px 30px;      | **上**设置为10px<br>**左右**设置为20px<br>**下**设置为30px                |
| 四个值 | padding: 10px 20px 30px 40px; | **上**设置为10px<br>**右**设置为20px<br>**下**设置为30px<br>**左**设置为40px |
记忆规则：**从上开始赋值，然后顺时针赋值，如果设置赋值的，看对面的！！**

外边距（margin）**单方向**设置：
	场景：只给盒子的某个方向单独设置外边距。
	属性名：margin - 方位名词
	属性值：数字 + px
	应用：可以让盒子在**某个方向移动**来进行**微调**。


---

## 6. 阴影 box-shadow
作用：
	用于在元素的**外部或内部**添加一个或多个阴影效果，可以创建深度、层次感和立体效果。

特点：
1. 不影响布局：阴影不占空间，不会影响其他元素的排列。
2. 可叠加：可以同时应用多个阴影。
3. 支持圆角：阴影会跟随元素的 `border-radius` 形状。
4. 高性能：硬件加速，动画流畅。


语法结构：
```css
box-shadow: [inset] [offset-x] [offset-y] [blur-radius] [spread-radius] [color];
```

| 参数            | 说明              | 例子                        | 是否必须 |
| ------------- | --------------- | ------------------------- | ---- |
| inset         | 阴影类型（内阴影/外阴影）   | inset 或 省略                | 可选   |
| offset-x      | 水平偏移量           | 10px（右），-10px（左）          | 必须   |
| offset-y      | 垂直偏移量           | 10px（下），-10px（上）          | 必须   |
| blur-radius   | 模糊半径（越大越模糊）     | 5px，20px（0=不模糊）           | 可选   |
| spread-radius | 扩展半径（正=扩大,负=缩小） | 5px，-5px                  | 可选   |
| color         | 阴影颜色            | \#000，raba（0，0，0，0.5），red | 可选   |

速查表：

| 效果   | 代码片段                                          |
| ---- | --------------------------------------------- |
| 轻微悬浮 | box-shadow: 0 4px 6px rgba(0,0,0,0.1)         |
| 明显悬浮 | box-shadow: 0 10px 20px rgba(0,0,0,0.15)      |
| 底部阴影 | box-shadow: 0 5px 15px rgba(0,0,0,0.2)        |
| 四周发光 | box-shadow: 0 0 20px rgba(0,150,255,0.5)      |
| 内凹效果 | box-shadow: inset 3px 3px 5px rgba(0,0,0,0.2) |
| 双层边框 | box-shadow: 0 0 0 2px \#fff, 0 0 0 4px #000   |
| 顶部光晕 | box-shadow: 0 -5px 15px rgba(255,255,255,0.8) |

## 7. 盒子实际大小计算公式

**1\. 注意点：** 
1. 设置width和height是内容的宽高！
2. 设置border会撑大盒子（就是设置边框）。
3. 设置padding会撑大盒子（就是设置内边距）。

**2\. 盒子实际大小初级计算公式：**
- 盒子宽度 = 左边框 + 左padding + 内容宽度 + 右passing + 右边框
- 盒子高度 = 左边框 + 上padding + 内容宽度 + 下passing + 右边框

**3\. 问：当盒子被border和padding撑大后，如何满足需求？**
- 法1：手动内减
	- 解决计算多余大小，手动在内容中减去（手动内减）。
- 法2：自动内减
	- 给盒子设置属性 **box-sizing : border-box;** 即可。
	- 浏览器会自动计算多余大小，自动在内容中减去。



---

## 8. 不会撑大盒子的特殊情况
对于块级元素：
1. 如果子盒子没有设置宽度，此时宽度默认是父盒子的宽度。

2. 此时给子盒子设置左右的padding或者左右的border，此时不会撑大子盒子。



## 9. 清除默认内外边距
场景：
- 浏览器会默认给部分标签设置默认的margin和padding，但一般在项目开始前需要先清除这些标签默认的margin和padding，后续自己设置。

解决方法：
```css
*{
	margin:0;
	padding:0;
}
或
标签名{
	margin:0;
	padding:0;
}

```

## 10. 盒子居中
设置：
```css
div{
	margin:0 auto;
}
```
其中：
	0：设置上下外边距为0。
	auto：设置左右外边距为平局。

## 11. 外边距折叠现象 – 塌陷现象
场景：**互相嵌套** 的 **块级元素**，子元素的 **margin-top** 会作用在父元素上
结果：导致父元素**一起往下移动。**
解决方法：
1. 给父元素设置border-top 或者 padding-top（分隔父子元素的margin-top）。
2. 给父元素设置**overflow：hidden**
3. 转换成**行内块元素**。
4. 设置**浮动**。


## 12. 行内元素的margin和padding无效情况
场景：给行内元素设置margin和padding时
结果：
1. 水平方向的margin和padding布局中有效！
2. 垂直方向的margin和padding布局中无效！



---

# CSS布局 - 浮动 float
## 认识css浮动

属性名：**float**

|  属性值  | 效果  |
| :---: | :-: |
| left  | 左浮动 |
| right | 右浮动 |

```css
div{
	float:letf   --- 左浮动
	float:reght  --- 右浮动
}
```

1\. 作用：
1. 产生文字环绕效果。
2. 用于布局，让垂直布局的盒子变成水平布局，如：一个在左，一个在右。

2\. 浮动的特点：
1. 浮动元素会**脱离标准流**（简称：脱标）但未完全脱离，如脱，在标准流中不占位置，相当于从地面飘到了空中。
2. 在脱标后，后面的标准流元素会“**抢占**”脱标后标准流元素的位置。
3. 浮动元素比标准流高半个级别，可以**覆盖**标准流中的元素。
4. 虽然可以覆盖，**但不是完全覆盖**，浮动元素与标准流元素的关系是"**部分遮挡**"：
	- **挡住的部分**：背景、边框、其他块级内容。
	- **不挡住的部分**：文字和内联内容（它们会环绕，聪明地避开浮动元素）。

5. 浮动找浮动，下一个浮动元素会在上一个浮动元素后面左右浮动。
6. 浮动元素有特殊的显示效果：
	1. 一行可以显示多个。
	2. 可以设置宽高。

3\. 注意点：
- 浮动的元素不能通过text-align:center或者margin:0  auto，因为这两个只对标准流有效。


## 清除CSS浮动
带来的影响：
- 如果子元素浮动了，此时子元素不能撑开标准流的块级父元素(父元素会**高度坍塌**)。


### 法1：直接设置父元素高度 

特点：
- 优点：简单粗暴，方便。
- 缺点：有些布局中不能固定父元素高度。如：新闻列表、京东推荐模块。


### 法2：额外标签法

操作：
1. 在父元素内容的最后添加一个块级元。
2.  给添加的块级元素设置 **clear:both**。

特点：
- 缺点：会在页面中添加额外的标签，会让页面的HTML结构变得复杂。


### 法3：单伪元素清除法

操作：用伪元素替代了额外标签。
```css
.clearfix::after {
	content:'';
	display:block;
	clear:both; /* 清除左右两侧的浮动 */
	/*补充代码：在网页中看不到伪元素*/
	height:0;
	visibility:hidden;
}
```
原理：
- 在父元素末尾创建一个看不见的元素，让它"清除浮动"，强迫父元素意识到浮动元素的存在。

特点：
- 优点：项目中使用，直接给标签加类即可清除浮动。


### 法4：双伪元素清除法
操作：
```css
.clearfix::before,
.clearfix::after {
	content:'';
	display:table;
}
.clearfix::after {
	clear:both;
}
```
特点：
- 优点：项目中使用，直接给标签加类即可清除浮动。


### 法5：给父元素设置overflow : hidden

操作：
- 直接给父元素设置 **overflow : hidden**

特点：
- 优点：方便。




---

## 网页布局案例(未完成)

要求：使用浮动，完成设计图中布局效果

案例1：
![[assets/图片/CSS/浮动应用案例1.png]]
代码看这[[]]

> [!tag] 记得完成这3个案例，代码单独放一个文件夹。


案例2：
![[assets/图片/CSS/浮动应用案例2.png]]


案例3：
![[assets/图片/CSS/浮动应用案例3.png]]



---

# CSS布局 - 定位 position
## 认识CSS定位
定位的常见应用场景是什么？
1.   解决盒子与盒子之间的层叠问题 → 定位之后元素层级最高，可以层叠在其他盒子上。
2. 可以让盒子**始终固定**在屏幕中的某个位置。

属性名：**position**
常见属性值：

| 定位方式 |   属性值    | 相对于谁移动            | 是否占位置    |
| :--: | :------: | ----------------- | -------- |
| 静态定位 |  static  | 不能通过方位属性移动（标准流）   | 占位置      |
| 相对定位 | relative | 相对于自己原来的位置        | 占位置      |
| 绝对定位 | absolute | 相对于最近的且有定位的祖先元素移动 | 不占位置（脱标） |
| 固定定位 |  fixed   | 相对于浏览器可视区域        | 不占位置（脱标） |

设置偏移值：
- 属性格式：直接写 **属性名: 属性值;**
- 偏移值设置分为两个方向，**水平和垂直方向**各选一个使用即可。
- 选取的原则一般是**就近原则** （离哪边近用哪个）。


| 方向  | 属性名    | 属性值   | 含义      |
| --- | ------ | ----- | ------- |
| 水平  | left   | 数字+px | 距离左边的距离 |
| 水平  | right  | 数字+px | 距离右边的距离 |
| 垂直  | top    | 数字+px | 距离上边的距离 |
| 垂直  | bottom | 数字+px | 距离下边的距离 |

## 静态定位 static
介绍：静态定位是默认值，就是之前认识的**标准流**。
属性格式：**position: static;**
注意点：
1. 静态定位就是之前标准流，不能通过**方位属性**进行移动。
2. 之后说的定位不包括静态定位，一般特指后几种：相对、绝对、固定。


## 相对定位  relaltive
介绍：自恋型定位，**相对于自己之前的位置进行移动。**
代码：**position: relaltive;**
特点：
1. 需要**配合方位属性**实现移动。
2. 相对于自己**原来位置**进行移动。
3. 在页面中占位置 → 没有脱标。
4. 左上优先。

应用场景：
1. 配合绝对定位组CP（子绝父相）。
2. 用于小范围的移动。


## 绝对定位 absolute
介绍：拼爹型定位，相对于非静态定位的父元素进行定位移动。
代码：**position: absolute;**
特点：
1. 需要配合方位属性实现移动。
2. 默认相对于浏览器可视区域进行移动。
3. 在页面中不占位置 → **已经脱标**。

应用场景：
- 配合绝对定位组CP（子绝父相）。


绝对定位相对于谁进行偏移？
- 绝对定位元素总是相对于**最近的已定位祖先元素**（非static）进行定位。
- 如果没有已定位祖先，则相对于**根元素（html**）定位。
- 通过合理设置父元素的定位属性，可以精确控制绝对定位子元素的位置。


## 子绝父相
场景：让子元素**相对于父元素**进行自由移动。
含义：
- 子元素：绝对定位。
- 父元素：相对定位。

子绝父相好处：
- 父元素是相对定位，则对网页布局影响最小。


## 使用子绝父相居中
### 使用子绝父相水平居中
1\. 先让子盒子往右移动**父盒子**的一半
- left：50%

2\. 再让子盒子往左移动**自己**的一半
- transform：translateX(-50%)
- 优点：表示沿着X轴负方向（往左）始终移动自己宽度的一半，子盒子宽度变化不需要更改代码。
 

### 使用子绝父相垂直居中
1\. 让子盒子往右走大盒子一半
- left：50%

3\. 让子盒子往下走大盒子一半
- top：50%

4\. 让子盒子往左+往上走自己的一半
- transform：translate(-50%，-50%)；



## 固定定位 fixed
介绍：死心眼型定位，相对于浏览器进行定位移动。
代码：**position: fixed;**
特点：
1. 需要配合方位属性实现移动。
2. 相对于浏览器可视区域进行移动。
3. 在页面中不占位置 → **已经脱标**。

应用场景：
- **让盒子固定在屏幕中的某个位置**。


## 更改定位元素的层级 z-index
### 认识
场景：改变定位元素的层级
属性名：**z-index**
属性值：数字
- 数字越大，层级越高

属性默认值：
 - 为 auto，在这种情况下，元素的堆叠顺序由其在HTML中的位置决定（**后定义的元素通常会覆盖先定义的元素**）


### 堆叠上下文（Stacking Context）
理解堆叠上下文是掌握z-index的关键：
1. **什么是堆叠上下文**
    
	- 堆叠上下文是一个独立的渲染区域，其中的所有元素都相对于该上下文进行堆叠
    - 每个堆叠上下文就像一个独立的小世界，内部元素的z-index只在这个世界内有效
2. **创建堆叠上下文的条件**：
    
    - 设置了非static定位且z-index不为auto的元素
    - 设置了 `opacity` 小于1的元素
    - 设置了 `transform` 不为none的元素
    - 使用 `will-change` 属性指定了某些属性的元素
    - 其他一些特定CSS属性也会创建堆叠上下文
3. **堆叠上下文的特性**：
    
    - 堆叠上下文内部的元素无法通过z-index影响外部元素
    - 父级堆叠上下文的层级会影响子级堆叠上下文的显示顺序




---

# CSS布局 - 元素层级关系
1\. 不同布局方式元素的层级关系：
- 标准流 < 浮动 < 定位

2\. 不同定位之间的层级关系：
 - 相对、绝对、固定默认层级相同
- 此时HTML中写在下面的元素层级更高，会覆盖上面的元素




---

# CSS布局 - Flexbox 布局
## 1. 认识 Flexbox
Flexbox 又叫 弹性盒子，特点是：一维布局，适合线性排列。

有两个轴：
- - **主轴（Main Axis）**：由 `flex-direction` 定义的方向
- **交叉轴（Cross Axis）**：垂直于主轴的方向


两个容器：
- **Flex 容器**：设置 `display: flex` 的元素
- **Flex 项目**：Flex 容器的**直接子元素**


## 2. Flex 容器属性
### 2.1 display - 定义容器类型
```css
.container {
  display: flex;          /* 块级弹性容器，类型块级元素，独占一行 */
  display: inline-flex;   /* 内联弹性容器，类型行级元素，多元同行 */
}
```

### 2.2 flex-direction - 主轴方向
```css
.container {
  flex-direction: row;            /* 默认：从左到右 */
  flex-direction: row-reverse;    /* 从右到左 */
  flex-direction: column;         /* 从上到下 */
  flex-direction: column-reverse; /* 从下到上 */
}
```

### 2.3 flex-wrap - 是否换行
```css
.container {
  flex-wrap: nowrap;      /* 默认：不换行（可能溢出） */
  flex-wrap: wrap;        /* 换行（从上到下） */
  flex-wrap: wrap-reverse;/* 换行（从下到上） */
}
```

### 2.4 flex-flow - 简写
```css
.container {
  flex-flow: row nowrap;  /* direction + wrap */
}
```

### 2.5 justify-content - 主轴对齐
```css
.container {
  /* 从主轴起点开始排列 */
  justify-content: flex-start;    /* 默认 */
  
  /* 从主轴终点开始排列 */
  justify-content: flex-end;
  
  /* 居中排列 */
  justify-content: center;
  
  /* 两端对齐，项目间间隔相等 */
  justify-content: space-between;
  
  /* 每个项目两侧间隔相等 */
  justify-content: space-around;
  
  /* 项目间和边缘间隔都相等 */
  justify-content: space-evenly;
}
```

### 2.6 align-items - 交叉轴对齐（单行）
```css
.container {
  /* 拉伸填满容器高度 */
  align-items: stretch;     /* 默认 */
  
  /* 从交叉轴起点开始排列 */
  align-items: flex-start;
  
  /* 从交叉轴终点开始排列 */
  align-items: flex-end;
  
  /* 居中对齐 */
  align-items: center;
  
  /* 基线对齐（文本底部对齐） */
  align-items: baseline;
}
```

### 2.7 align-content - 交叉轴对齐（多行）
```css
.container {
  align-content: stretch;      /* 默认：拉伸填满 */
  align-content: flex-start;   /* 从交叉轴起点开始 */
  align-content: flex-end;     /* 从交叉轴终点开始 */
  align-content: center;       /* 居中 */
  align-content: space-between;/* 两端对齐 */
  align-content: space-around; /* 每行间隔相等 */
}
```

## 3. Flex 项目属性
### 3.1order - 排序
```css
.item {
  order: 0;  /* 默认值，数值越小排列越靠前 */
}
```

### 3.2 flex-grow - 放大比例
```css
.item {
  flex-grow: 0;  /* 默认：不放大 */
  flex-grow: 1;  /* 按比例放大 */
}
```

### 3.3 flex-shrink - 缩小比例
```css
.item {
  flex-shrink: 1;  /* 默认：空间不足时缩小 */
  flex-shrink: 0;  /* 不缩小（保持原尺寸） */
}
```

### 3.4 flex-basis - 初始大小
```css
.item {
  flex-basis: auto;    /* 默认：项目原大小 */
  flex-basis: 100px;   /* 固定宽度 */
  flex-basis: 20%;     /* 百分比宽度 */
  flex-basis: 0;       /* 从0开始分配空间 */
}
```

### 3.5 flex - 简写属性
```css
.item {
  /* 常用模式 */
  flex: initial;      /* 0 1 auto（默认） */
  flex: auto;         /* 1 1 auto（可伸缩） */
  flex: none;         /* 0 0 auto（不可伸缩） */
  flex: 1;            /* 1 1 0%（等分） */
  
  /* 完整写法：flex-grow flex-shrink flex-basis */
  flex: 2 1 100px;
}
```

### 3.6 align-self - 单独对齐
```css
.item {
  align-self: auto;        /* 继承容器的 align-items */
  align-self: flex-start;  /* 顶部对齐 */
  align-self: flex-end;    /* 底部对齐 */
  align-self: center;      /* 居中对齐 */
  align-self: stretch;     /* 拉伸填满 */
  align-self: baseline;    /* 基线对齐 */
}
```

## 4. 使用布局模式
### 4.1 水平垂直居中
```css
.center {
  display: flex;
  justify-content: center;  /* 水平居中 */
  align-items: center;      /* 垂直居中 */
}
```

### 4.2 等分布局
```css
.container {
  display: flex;
}
.item {
  flex: 1;  /* 每个项目等分空间 */
}
```

### 4.3 固定 + 自适应
```css
.container {
  display: flex;
}
.sidebar {
  flex: 0 0 250px;  /* 不放大，不缩小，固定250px */
}
.content {
  flex: 1;          /* 占据剩余所有空间 */
}
```

### 4.4 底部对齐
```css
.container {
  display: flex;
  align-items: flex-end;  /* 所有项目底部对齐 */
}
```

### 4.5 圣杯布局
```css
.container {
  display: flex;
  flex-direction: column;  /* 垂直排列 */
}
.header, .footer {
  flex: 0 0 auto;          /* 固定高度 */
}
.content {
  display: flex;           /* 内容区内部flex */
  flex: 1;                 /* 占据中间空间 */
}
```

## 5. 常用简写值
```txt
flex: 0 1 auto    → 初始（默认）
flex: 1 1 auto    → 自动
flex: 0 0 auto    → 无弹性
flex: 1           → 等分（常用）
flex: none        → 无弹性
```



---

# CSS装饰
## 垂直对齐方式 vertical-align
基线：浏览器文字类型元素排版中存在用于对齐的基线（baseline）。
属性名 ：**vertical-align**
属性值：

| 属性值      | 效果      |
| -------- | ------- |
| baseline | 默认，基线对齐 |
| top      | 顶部对齐    |
| middle   | 中部对齐    |
| bottom   | 底部对齐    |

举个例子：
```css
.user img{
    vertical-align: middle;
}
```

## 光标类型 cursor
场景：设置鼠标光标在元素上时显示的样式
属性名：**cursor**
常见属性值：

| 属性值     | 效果             |
| ------- | -------------- |
| default | 默认值，通常是箭头      |
| pointer | 小手效果，提示用户可以点击  |
| text    | 工字型，提示用户可以选择文字 |
| move    | 十字光标，提示用户可以移动  |

## 边框圆角 border-radius
场景：让盒子四个角变得圆润，增加页面细节，提升用户体验。
属性名：**border-radius**
常见取值：数字+px 、百分比
原理：![[assets/图片/CSS/边框圆角.png]]

- 每个角的水平半径 = 元素宽度 × 百分比
- 每个角的垂直半径 = 元素高度 × 百分比

最后将每个角的水平、垂直半径延长相交后的交点就是圆心，它的某一个角的边就是为矩形某个角设置的圆弧。

属性格式：
```css
/* 简写形式 */
border-radius: 值;

/* 完整形式，分别设置四个角 */
border-radius: 左上角 右上角 右下角 左下角;

/*可以为每个角分别设置水平和垂直半径，用斜杠分隔*/
.element {
  /* 水平半径：左上 右上 右下 左下 */
  /* 垂直半径：左上 右上 右下 左下 */
  border-radius: 10px 20px 30px 40px / 5px 15px 25px 35px;
}
```
赋值规则：从左上角开始赋值，然后顺时针赋值，没有赋值的看对角！

当使用 `50%` 且元素宽高相等时，可以创建完美的圆形：
```css
.circle {
  width: 100px;
  height: 100px;
  border-radius: 50%; /* 创建圆形 */
}
```

## 溢出部分显示效果 overflow
溢出部分：指的是盒子 **内容部分** 所**超出**盒子范围的区域
场景：控制内容溢出部分的显示效果，如：显示、隐藏、滚动条……
属性名：**overflow**
常见属性值：

| 属性值     | 效果                 |
| ------- | ------------------ |
| visible | 默认值，溢出部分可见。        |
| hidden  | 溢出部分隐藏。            |
| scroll  | 无论是否溢出，都显示滚动条。     |
| auto    | 根据是否异常，自动显示或隐藏滚动条。 |


## 元素本身隐藏
场景：让某元素本身在屏幕中不可见。如：鼠标:hover之后元素隐藏
常见属性：
1. **visibility：hidden**
2. **display：none**

区别：
1. visibility：hidden 隐藏元素本身，并且在网页中 **占位置**
2. display：none 隐藏元素本身，并且在网页中 **不占位置**

注意点：
- 开发中经常会通过 display属性完成元素的显示隐藏切换。
- display：none；（隐藏）、  display：block；（显示）。


## 元素整体透明度 opacity
场景：让某元素整体（包括内容）一起变透明。
属性名：**opacity**
属性值：0~1之间的数字
- 1：表示完全不透明
- 0：表示完全透明

注意点：
- opacity会让元素整体透明，包括里面的内容，如：文字、子元素等……


## 边框合并
场景：让相邻表格边框进行合并，得到细线边框效果
代码：**border-collapse：collapse；**
合并前：![[assets/图片/CSS/合并前.png]]
合并后：![[assets/图片/CSS/合并后.png]]
## 用CSS画三角形
1\. 需要知道：
- 当你为一个元素设置边框时，相邻边框之间的连接处并不是直角，而是斜线。这是关键！


2\. 这是一个没有内容区域的边框，可以看到每个都是一个三角形。
如果有内容区域，则每个边框是梯形。
```css
.box {
    width: 0;
    height: 0;
    border-top: 50px solid red;
    border-right: 50px solid green;
    border-bottom: 50px solid blue;
    border-left: 50px solid yellow;
}
```

3\. 将其它3个边框的透明度设置为0，就可以得到一个三角形。
```css
.triangle {
    width: 0;
    height: 0;
    border-left: 50px solid transparent;  /* 左边界透明 */
    border-right: 50px solid transparent; /* 右边界透明 */
    border-bottom: 100px solid #3498db;   /* 底部边界可见（蓝色） */
    /* 顶部边界默认不存在，等同于设置为0宽度 */
}
```





# 这是分割线ABCD


---


# CSS渐变
## 1. 认识 CSS渐变
定义：CSS代码创建的两种及以上颜色的平滑过渡区域。
类型：CSS图像（`<image>`）的一种。
有三大渐变类型：

| 类型   | 语法函数              | 方向特点    | 常见应用          |
| ---- | ----------------- | ------- | ------------- |
| 线性渐变 | linear-gradient() | 沿直线方向   | 按钮背景、页面背景、分隔线 |
| 径向渐变 | radial-gradient() | 从中心向外扩散 | 圆形元素、光晕效果、聚光灯 |
| 锥形渐变 | conic-gradient()  | 围绕中心旋转  | 饼图、色轮、时钟样式    |

## 2. 线性渐变
```css
/* 基本语法 */
background: linear-gradient([方向], 颜色1 [位置], 颜色2 [位置], ...);

/* 示例 */
.simple {
    /* 默认从上到下 */
    background: linear-gradient(red, blue);
}

.horizontal {
    /* 从左到右 */
    background: linear-gradient(to right, #ff7e5f, #feb47b);
}

.diagonal {
    /* 45度角 */
    background: linear-gradient(45deg, #3a7bd5, #00d2ff);
}

.multi-color {
    /* 多颜色带精确位置 */
    background: linear-gradient(
        to right,
        red 0%,      /* 起始 */
        yellow 30%,   /* 30%位置 */
        blue 60%,     /* 60%位置 */
        purple 100%   /* 结束 */
    );
}
```

## 3. 径向渐变
```css
/* 基本语法 */
background: radial-gradient([形状] [大小] at [位置], 颜色1, 颜色2, ...);

/* 示例 */
.circle {
    /* 默认从中心圆形扩散 */
    background: radial-gradient(circle, #ff9a9e, #fad0c4);
}

.ellipse {
    /* 椭圆形 */
    background: radial-gradient(ellipse at center, #a1c4fd, #c2e9fb);
}

.positioned {
    /* 指定位置 */
    background: radial-gradient(circle at top right, yellow, red, transparent);
}
```

## 4. 锥形渐变
```css
/* 基本语法 */
background: conic-gradient([from 角度] at [位置], 颜色1 [角度], 颜色2 [角度], ...);

/* 示例 */
.color-wheel {
    /* 色轮 */
    background: conic-gradient(red, yellow, lime, aqua, blue, magenta, red);
    border-radius: 50%; /* 变成圆形 */
}

.pie-chart {
    /* 饼图（四等分） */
    background: conic-gradient(
        #ff6384 0deg 90deg,
        #36a2eb 90deg 180deg,
        #ffce56 180deg 270deg,
        #4bc0c0 270deg 360deg
    );
}
```

## 5. 重复渐变
```css
/* 重复线性渐变 - 条纹效果 */
.stripes {
    background: repeating-linear-gradient(
        45deg,
        #f0f0f0 0px, #f0f0f0 10px,
        #ccc 10px, #ccc 20px
    );
}

/* 重复径向渐变 - 同心圆 */
.target {
    background: repeating-radial-gradient(
        circle,
        #fff 0, #fff 10px,
        #000 10px, #000 20px
    );
}

/* 重复锥形渐变 - 旋转条纹 */
.conic-stripes {
    background: repeating-conic-gradient(
        #fff 0deg 15deg,
        #000 15deg 30deg
    );
}
```




# CSS动画 - transform（变换）
## 1. 认识 transform
作用：
	`transform` 是 CSS3 中的一个强大属性，用于对元素进行 2D 或 3D 变换，包括：移动、旋转、缩放、倾斜、3D变换 。

基本语法：
```css
选择器{
	transform:函数(值);
	transform-origin:x轴 y轴 z轴; /* 变换原点 */
}
```

注意：
	只写 transform 的属性是**不会有**动画效果的。因为 transform 的属性只决定了动画的最终效果，其中变换的过程，要靠 **transition** 或 **animation** 来实现，所以要实现动画效果，需要配合这两个使用。

## 2. 2D 变换函数
### 2.1 平移（translate）
```css
/* 水平移动 */
transform: translateX(100px);

/* 垂直移动 */
transform: translateY(50px);

/* 同时水平和垂直移动 */
transform: translate(100px, 50px); /* x, y */
```

### 2.2 缩放（scale）
```css
/* 均匀缩放 */
transform: scale(1.5); /* 放大1.5倍 */
transform: scale(0.5); /* 缩小一半 */

/* 非均匀缩放 */
transform: scaleX(2); /* 宽度放大2倍 */
transform: scaleY(0.5); /* 高度缩小一半 */
transform: scale(2, 0.5); /* 宽度2倍，高度一半 */
```

### 2.3 旋转（rotate）
```css
/* 2D旋转 */
transform: rotate(45deg); /* 顺时针45度 */
transform: rotate(-90deg); /* 逆时针90度 */
```

### 2.4 倾斜（skew）
```css
/* 水平倾斜 */
transform: skewX(30deg);

/* 垂直倾斜 */
transform: skewY(20deg);

/* 同时倾斜 */
transform: skew(30deg, 20deg); /* x, y */
```

### 2.5 矩阵变换（matrix）
```css
/* 2D矩阵变换 */
transform: matrix(a, b, c, d, e, f);
/* 
  a: 水平缩放
  b: 垂直倾斜
  c: 水平倾斜
  d: 垂直缩放
  e: 水平移动
  f: 垂直移动
*/
```

## 3. 3D 变换函数
### 3.1 3D 平移
```css
transform: translateZ(100px);
transform: translate3d(100px, 50px, 200px); /* x, y, z */
```

### 3.2 3D 缩放
```css
transform: scaleZ(2);
transform: scale3d(1.5, 1.5, 2);
```

### 3.3 3D 旋转
```css
transform: rotateX(45deg); /* 绕X轴旋转 */
transform: rotateY(60deg); /* 绕Y轴旋转 */
transform: rotateZ(30deg); /* 绕Z轴旋转 */

/* 自定义轴旋转 */
transform: rotate3d(1, 1, 0, 45deg); /* x, y, z, angle */
```

### 3.4 3D 矩阵
```css
transform: matrix3d(...16个值...);
```

## 4. 变换原点 transform-origin
```css
/* 关键字 */
transform-origin: center;    /* 默认 */
transform-origin: left top;
transform-origin: right bottom;

/* 百分比 */
transform-origin: 50% 50%;   /* 中心 */
transform-origin: 0% 0%;     /* 左上角 */
transform-origin: 100% 100%; /* 右下角 */

/* 长度值 */
transform-origin: 10px 20px;

/* 3D原点 */
transform-origin: 50% 50% 100px;
```

## 5. 3D 变换相关属性
### 5.1 perspective（透视）
```css
/* 在父元素上设置 */
.container {
  perspective: 500px; /* 透视距离 */
}

/* 或作为transform函数 */
transform: perspective(500px) rotateY(45deg);
```

### 5.2 perspective-origin（透视原点）
```css
.container {
  perspective: 500px;
  perspective-origin: 25% 75%; /* 观察点位置 */
}
```

### 5.3 transform-style（变换样式）
```css
.container {
  transform-style: flat;      /* 默认，子元素2D呈现 */
  transform-style: preserve-3d; /* 子元素保留3D位置 */
}
```

### 5.4 backface-visibility（背面可见性）
```css
.card {
  backface-visibility: hidden; /* 背面不可见 */
  backface-visibility: visible; /* 默认，背面可见 */
}
```

## 6. 启用GPU加速
```css
.element {
  transform: translateZ(0); /* 或 translate3d(0,0,0) */
}
```



---


# CSS动画 - transition（过渡）
## 1. 认识 transition
介绍：
	**transition（过渡）** 是CSS3中用于让元素样式**平滑变化**的属性。当元素的CSS属性值发生变化时，`transition` 会在这两个值之间创建**平滑的中间帧**，形成动画效果。

特性：
- **被动触发**：只有属性值改变时才工作。
- **补间动画**：自动计算开始和结束状态之间的中间值。


工作流程：
```css
/* 基本工作流程 */
.element {
  width: 100px;                    /* 初始状态 */
  transition: width 0.5s ease;     /* 监听width变化 */
}

.element:hover {
  width: 200px;                    /* 最终状态 */
  /* transition自动生成从100px到200px的0.5秒动画 */
}
```

## 2. transition 属性
### 2.1 property - 指定要过渡的属性
```css
transition-property: width;        /* 只过渡宽度 */
transition-property: width, height; /* 过渡多个属性 */
transition-property: all;          /* 过渡所有可过渡属性 */
transition-property: none;         /* 无过渡效果 */
```

### 2.2 duration - 过渡持续时间
```css
transition-duration: 0.5s;         /* 0.5秒 */
transition-duration: 500ms;        /* 500毫秒 */
transition-duration: 2s, 0.5s;     /* 多个属性分别设置时间 */
```

### 2.3 timing-function - 过渡速度曲线
控制动画的**加速度变化**，是流畅感的关键：
```css
/* 关键字值 */
transition-timing-function: ease;           /* 默认，慢→快→慢 */
transition-timing-function: linear;         /* 匀速 */
transition-timing-function: ease-in;        /* 慢→快 */
transition-timing-function: ease-out;       /* 快→慢 */
transition-timing-function: ease-in-out;    /* 慢→快→慢（比ease平缓） */
transition-timing-function: steps(4);       /* 分4步跳跃 */

/* 贝塞尔曲线 - 高度自定义 */
transition-timing-function: cubic-bezier(0.25, 0.46, 0.45, 0.94);
/* cubic-bezier(x1, y1, x2, y2) 四个点定义曲线 */
```

**常见贝塞尔曲线值**：
- `cubic-bezier(.25, .1, .25, 1)` → 等同于 `ease`
- `cubic-bezier(0, 0, 1, 1)` → 等同于 `linear`
- `cubic-bezier(.42, 0, 1, 1)` → 等同于 `ease-in`
- `cubic-bezier(0, 0, .58, 1)` → 等同于 `ease-out`
- `cubic-bezier(.42, 0, .58, 1)` → 等同于 `ease-in-out`


### 2.4 delay - 过渡开始前的延迟
```css
transition-delay: 0s;              /* 立即开始（默认） */
transition-delay: 0.3s;            /* 0.3秒后开始 */
transition-delay: -0.5s;           /* 负值：从动画中途开始 */
```

## 3. transition 属性连写
```css
/* 从左往右依次是：过渡属性 持续时间 缓动函数 延时 */
/* 可以同时定义多个属性的过渡效果，每个属性用“,”隔开 */
transition: property1 duration1 timing-function1 delay1,
            property2 duration2 timing-function2 delay2,
            property3 duration3 timing-function3 delay3;
```

## 4. 无动画设置（不懂）
```css
@media (prefers-reduced-motion: reduce) {
  * {
    transition: none !important;
  }
}
```

# 未完，差示例



# CSS伪类选择器
## 结构伪类选择器
1\. 作用与优势：
1. 作用：根据元素在HTML中的结构关系查找元素。
2. 优势：减少对于HTML中类的依赖，有利于保持代码整洁。
3. 场景：常用于查找**某父级选择器**中的子元素。

有如下选择器：

|           选择器            | 说明                        |
| :----------------------: | ------------------------- |
|    E :first-child { }    | 匹配父元素中第一个子元素，并且是E元素。      |
|    E :last-child { }     | 匹配父元素中最后一个子元素，并且是E元素。     |
|   E :nth-child(n) { }    | 匹配父元素中第n个子元素，并且是E元素。      |
| E :nth-last-child(n) { } | 匹配父元素中倒数第n个子元素，并且是E元素。    |
|  E :nth-of-type(n) { }   | 只在父元素的同类型(E)子元素范围中，匹配第n个。 |
n的注意点：
1. n为：0、1、2、3、......
2. 通过n可以组成常见的公式：

|    功能    |      公式       |
| :------: | :-----------: |
|    偶素    |    2n、even    |
|    奇数    | 2n+1、2n-1、odd |
|  找到前5个   |     -n+5      |
| 找到从第5个往后 |      n+5      |


2\. **E :nth-child(n) { }** 与 **E :nth-of-type(n) { }**的区别：
以\<div>为例：
```html
	<div class="parent">
		<p>段落1</p>     <!-- 位置1 -->
		<div>div1</div>  <!-- 位置2 -->
		<div>div2</div>  <!-- 位置3 -->
		<p>段落2</p>     <!-- 位置4 -->
		<div>div3</div>  <!-- 位置5 -->
	</div>
```

**`div:nth-child(n)` 选择器**：
- 选择父元素中**第n个子元素，并且这个子元素必须是div**。
- 会考虑父元素中的所有子元素（无论类型）。
- 只有当第n个子元素正好是div时才会匹配。
```css
	第一个子元素是<p>标签，无效。
	div:nth-child(1){
		background-color: rgb(237, 17, 17);      
	}
	第二个子元素是<div>标签，变红。
	div:nth-child(2){
		background-color: rgb(237, 17, 17);      
	}
	第三个子元素是<div>标签，变红。
	div:nth-child(4){
		background-color: rgb(237, 17, 17);      
	}
	第四个子元素是<p>标签，无效。
	div:nth-child(4){
		background-color: rgb(237, 17, 17);      
	}
```

`div:nth-of-type(n)` 选择器：
- 选择父元素中**第n个div类型的元素**
- 只考虑相同类型（tag name）的元素，忽略其他类型的元素
- 计数时只会统计同类型的元素
```css
	匹配父元素中第一个<div>标签，变红。实际上匹配的是位置2的标签。
	div:nth-of-type(1) {
		background-color: rgb(237, 17, 17);
	}
	匹配父元素中第二个<div>标签，变红。实际上匹配的是位置3的标签。
	div:nth-of-type(2) {
		background-color: rgb(237, 17, 17);
	}
	匹配父元素中第三个<div>标签，变红。实际上匹配的是位置5的标签。
	div:nth-of-type(3) {
		background-color: rgb(237, 17, 17);
	}
```


---

## 焦点伪类选择器 input:focus{}
使用场景：用于选中元素**获取焦点**时状态，常用于表单控件。
选择器语法：**选择器:focus{}**

## 链接伪类选择器 a:link{}
使用场景：常用于选中超链接的不同状态。
选择器语法：

|    选择器语法    |         功能         |
| :---------: | :----------------: |
|  a:link{}   | 选中a链接 **未访问过** 的状态 |
| a:visited{} | 选中a链接 **访问之后** 的状态 |
|  a:hover{}  |  选中 **鼠标悬停** 的状态   |
| a:active{}  |  选中 **鼠标按下** 的状态   |
注意点：
-   如果需要**同时实现**以上四种伪类状态效果，需要按照 **LVHA** 顺序书写。

- 其中 :hover伪类选择器 使用更为频繁，常用于选择各类元素的悬停状态。


这里单独讲解 a:hover{} 选择器
### 伪类选择器 a:hover{} 
选择器语法：选择器:hover { css }
```css
div:hover{css}
```
作用：选中鼠标悬停在元素上的状态，设置样式
举个例子：
```html
 <style>
       div:hover{
        background-color:rgb(255, 0, 0);
    }
 </style>
     
<body>
    <div>靠近我</div>
</body>
```
结果：
- 当鼠标靠近”靠近我”所在的一行时，该行变红。


注意点：
- 伪类选择器选中的是元素的某种状态，如：变色、放大。
 


---


# 待记录的部分（先看这个）
记录这个布局：
	居中效果
	display: flex
	align-items: center;
	justify-content: center;


display: inline-block; 不知道颜色意识


在写网页前清除网页部分布局：
```css
*{
    margin: 0;                 /* 清除所有外边距 */
    padding: 0;                /* 清除所有内边距 */
    box-sizing: border-box;    /* 使边距不计入盒子宽高 */
    list-style: none;          /* 清除列表样式 */
    text-decoration: none;     /* 清除文本样式 */
}

/* 使用伪元素解决父盒子中子元素使用浮动时父盒子高度塌陷问题 */
.clearfix::after{
    content: '';       /* 伪元素内容为空 */
    display: block;    /* 将伪元素转换为块级元素 */
    clear: both;        /* 清除左右浮动 */
}
```
