# git 的操作流程
fork 代表将别人的项目 copy一份到自己仓库

#### 将github上的代码clone到本地
git clone xxxx.git(url)

git status 
	代表的是 当前文件的状态
	
git add .
	添加需要提交的文件
	
git commit -m "提交的信息"
	提交

git push 
	推送到远程
	
git pull
	拉取远程的代码
	
### pull request    请求更新别人的开源项目
	注意要本地提交后 操作
1. 点 pull request -> New pull request
2. 先查看一下修改了哪些文件 -> 点 create pull request
3. 等待pull request 通过
4. git pull 拉取一下代码

注意：
	push 之前 最好pull 拉取一下代码
	
	如果是开源项目的更新 本地拉取：
	git pull https://github.com/likun-k/java_learn.git master

