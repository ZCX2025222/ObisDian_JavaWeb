
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
```

逻辑运算 and、or、not
