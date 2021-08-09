package com.hp.dae;





//dao层应该是个接口，因为可以使用AOP，目前不用AOP，可以直接写成类
public class UserDao {
    //增 删 改 查
    //查询 select * from t_user;
    //dao层如何和数据库对接，我们用到的知识点叫做jdbc，很基础的一个必须的技术
    //很多框架都是基于这个jdbc来的
    //要连接数据库，就需要用到刚刚 DBHelper.getConnection() 来创建一个 和mysql连接的对象
    //这个对象可以负责和mysql连接
    //查询


        //查询
        /*List<User> users = dao.selectAll();
        for (User user : users) {
            System.out.println("user = " + user);
        }*/

        //新增
        /*User user = new User();
        user.setUsername("xiaohuihui");
        user.setType(1);
        user.setReal_name("小灰灰");
        user.setPassword("123");
        user.setModify_time("2021-08-09");
        user.setIs_del(1);
        user.setImg("xxxx");
        user.setCreate_time("2021-08-09");
        int i = dao.addUser(user);
        System.out.println("i = " + i);*/

        //修改
        /*User user = new User();
        user.setId(12);
        user.setUsername("灰灰");
        user.setType(1);
        user.setReal_name("小灰灰");
        user.setPassword("1234567");
        user.setModify_time("2021-08-09 13:14:20");
        user.setIs_del(1);
        user.setImg("xxxx");
        user.setCreate_time("2020-07-19");
        int i=dao.update(user);
        System.out.println("i = " + i);*/
    }

