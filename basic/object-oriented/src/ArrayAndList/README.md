拉取远程 代码
```
git pull https://github.com/likun-k/java_learn.git master
```

## 任务要求：
    要求所有创建的文件 都在这个包下

#### 1. 新建数组
    新建一个 String[] 字符串数组 、 长度随意、 添加一些数据、最后用 for 循环打印

###### 1.1 进阶
    1. 使用for...in... 语句 循环打印
    2. 使用while 循环打印

#### 2. 数组存放对象
    1. 新建一个 User类  定义一些 属性
    2. 然后 创建一个 User 的数组 、长度随意 、并添加一些数据
    3. 循环打印 （任意方法）

可以试试 ： 如何将 User的数组 循环的同时，将User的某一个属性（比如说姓名 name），重新组合成一个数组。

#### 3. 冒泡排序
    使用下面的数组 完成冒泡排序
    
```
int[] myArray = new int[]{12,32,52,334,12,547,12,3,1,5,6,43,23,1,8,70,78,65,97,23,7,985,4,3,8};
//TODO code
```
冒泡排序的规则：

![image](https://github.com/likun-k/java_learn/blob/master/git/img/9916080-f0605d250bd43468.gif)
    

#### 4. 延展 
    数组在内存中如何分配 以及 JAVA 值的传递模式
    1. 查看下面的代码  执行、并查看TODO 打印的值
    
```java
public class Calculate {
    //Main 方法
    public static void main(String[] args){
        Calculate calc = new Calculate();
        String str = "A";
        calc.changeValue(str);
        System.out.println(str); //TODO 1. 

        int v = 2;
        calc.changeValue(v);
        System.out.println(v); //TODO 2. 

        String[] strs = new String[2];
        strs[0] = "AA";
        calc.changeValue(strs);
        System.out.println(strs[0]); //TODO 3. 
    }
	
    public void changeValue(String str){
        str = "B";
    }

    public void changeValue(int v){
        v = v + 10;
    }

    public void changeValue(String[] strs){
        strs[0] = "BB";
    }
}

```
