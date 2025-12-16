
打印字符串
```python
print("Hello World!")
```
字符串拼接
```python
print("Hello" + ' ' + "World" + '!')
```
字符串三引号自动换行
```python
# ''' ''' 和 """ """
print("""Hello World!  
		123  
		456  
		789""")
```

变量
```python
a = 1
b = 'a'
c = "abc"
d = "你好"
```

math算数工具包
```python
import math
```

注释
```python
 # 单行注释
 """
	 多行
	 注释
 """
```

len()：返回参数的长度
type()：返回参数的类型

在python中，字符串变量可以像字符串数组一样用索引取特定位置的字符
```python
a = "123456"
print(a[3])    # 返回4
```

python中的布尔值为`True`和`Flase`，注意首字母大写才有效。

输入函数 input()，返回字符串类型
```python
input("这里的字符串会被打印出来，用作输入提示")
# 如：
input("请输入密码：")
```

强制转换，如：int(参数)
```python
s = "123"
print(type(int(s))) # 返回 int
str() # 强转为字符串
```

if 判断
```python
if i == 1:
	print("i等于1")
elif i == 2:
	if i <= 10:
	print("i等于2小于等于10")
else:
	print("i等于其它")

# 通过in来判断元素a是否在list列表中
if a in list:
	print("a在list列表中")
else:
	print("a不在list列表中")
```

逻辑运算 and、or、not

列表：python的列表不限数据类型。
```python
num_list = [1, 13, -7 , 2, 96]
print(num_list[1])       # 可以通过索引获取列表元素，输出13
print(max(num list))     # 打印列表里的最大值
print(min(num list))     # 打印列表里的最小值
print(sorted(num list))  # 打印排序好的列表
num.append("abc")        # 向列表的末尾添加元素"abc"
```

字典：键值对的集合
```python
# 创建字典
dictionary = {"小红":123}
# 向字典里添加键值对
dictionary["小米"] = "手机"

# 查找字典
a = input("输入")  
if a in slang:  
    print(dictionary[a])  
else:  
    print("不在")
```
```python
dictionary.keys()     # 返回所有键
dictionary.values()   # 返回所有值
dictionary.items()    # 返回所有键值对
```

for循环：每次循环将可迭代对象中的元素赋值到变量中，再被循环体操作。
```python
for 变量 in 可迭代对象:
	# 循环体

# range()包头不包尾
for 变量 in range(开始值, 结束值, 步长):
	# 循环体
```

while循环
```python
while 判断条件：
	# 循环体
```

格式化字符串：`format()`方法
```python
"字符串{}".format(值)

# 按照位置顺序
print("{} {} {}".format("Hello", "world", "!")) # 输出: Hello world !

# 指定位置索引
print("{1} {0} {2}".format("world", "Hello", "!")) # 输出: Hello world !

# 按照关键参数
print("我叫{name}，今年{age}岁，来自{city}。".format(name="小明", age=18, city="北京"))
# 输出: 我叫小明，今年18岁，来自北京。

# 带格式格式规范
	# 数字格式化
	pi = 3.1415926
	print("圆周率约等于{:.2f}".format(pi))  # 保留两位小数，输出: 3.14
	
	# 对齐和填充
	print("{:>10}".format("右对齐"))  # 右对齐，占10个字符宽度
	print("{:^10}".format("居中"))    # 居中，占10个字符宽度
	print("{:0>5}".format(42))        # 用0左填充，占5位，输出: 00042
```

函数
```python
def 函数名(形参1, 形参2):
	函数体
	return 返回的内容;
```

引入模块的三种方法：
1. import 语句（推荐），会导入整个模块，使用时模块中的功能时要加上模块名作为前缀。
```python
import 模块名
# 如：
	import math  # 导入数学模块
	
	print(math.pi)  # 使用模块名.功能名的方式调用
	print(math.sqrt(16))  # 计算平方根
```
2. from...import... 语句，- 只导入模块中指定的功能（函数、类、变量等），- 使用时不需要加模块名前缀。
```python
from 模块名 import 函数名/变量名

# 如：
	from math import pi, sqrt  # 只导入pi和sqrt功能
	
	print(pi)  # 直接使用，不需要math.前缀
	print(sqrt(16))
```
3. form...import* 语句，导入模块中所有公开功能，使用时不需要加模块名前缀。
```python
from 模块名 import*

# 如：
	# 示例1：使用完整导入法
	import random
	slang = {"a": 1, "b": 2, "c": 3}
	random_key = random.choice(list(slang.keys()))
	print(f"随机选择的键：{random_key}，对应的值：{slang[random_key]}")
	
	# 示例2：使用选择性导入法
	from datetime import datetime
	print(f"当前时间：{datetime.now()}")
```

面向对象
类创建，python的类命名风格为大驼峰法。
```python
class CuteCatClass:
	# 构造函数，第一个参数固定为self，表示类本身，相当于java的this。
	def __init__(self, cat_name, 形参1, 形参2)
		self.name = cat_name
		slet.age  = 形参1
		slet.color= 形参2
```
创建对象
```python
# 创建类的对象
变量 = 类名(实参1, 实参2, 实参3)
cat1 = CuteCat("小花", 2, "白色")
```
调用类的属性
```python
对象名.属性名
print(cat1.name) # 输出："小花"
```

