一、实体类的创建规则
持久化对象 extends BaseEntity
查询对象 extends 持久化对象
视图对象 extends 持久化对象


二、这样创建实体类的好处
1.当表结构修改后，我们只需要修改持久化对象
2.修改各自对象互不影响，比如查询页面我需要增加或删除条件，只需要修改查询对象即可，此时修改查询对象不会影响到持久化对象和视图对象
3.风格统一，直观，易于维护


三、以用户表为例
用户表对应的持久化对象是TSysUser
用户表对应的查询对象是TSysUserSearch
用户表对应的列表视图对象是TSysUserList


四、注意
1.持久化对象的创建尽量和表名字一样，做到观其名而知其意，如t_sys_user对应的持久化对象是TSysUser，如TSysUserList就是列表视图对象


