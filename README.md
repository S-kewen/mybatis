# mybatis
* 官網：https://blog.mybatis.org/

* Mybatis Plus: https://github.com/S-kwen/mybatis-plus
### 什麼是Mybatis？
MyBatis是一款优秀的基于java的持久层框架，它内部封装了jdbc，使开发者只需要关注sql语句本身，而不需要花费精力去处理加载驱动、创建连接、创建statement等繁杂的过程
### 什么是持久化框架？
* 首先我们需要知道什么是持久化？

    持久化是将程序数据在持久状态和瞬时状态间转换的机制。通俗的讲，就是瞬时数据（比如内存中的数据，是不能永久保存的）持久化为持久数据（比如持久化至数据库中，能够长久保存）。
* 那什么是持久化框架呢？

    那就简单多了，就是一个用于管理那些持久化数据的框架，例如传统的JDBC或是当今流行的Mybatis、MybatisPlus和Hibernate
### Mybatis和 Hibernate有什么区别？
* MyBatis：

    是一个半自动映射的框架。这里所谓的“半自动”是相对于Hibernate全表映射而言的，MyBatis 需要手动匹配提供 POJO、SQL和映射关系，而Hibernate只需提供POJO 和映射关系即可。与Hibernate相比，虽然使用MyBatis手动编写 SQL 要比使用Hibernate的工作量大，但MyBatis可以配置动态SQL并优化SQL，可以通过配置决定SQL的映射规则，它还支持存储过程等。对于一些复杂的和需要优化性能的项目来说，显然使用MyBatis更加合适。

* Hibernate

    是一个全表映射的框架。通常开发者只需定义好持久化对象到数据库表的映射关系，就可以通过 Hibernate 提供的方法完成持久层操作。开发者并不需要熟练地掌握 SQL语句的编写，Hibernate会根据制定的存储逻辑，自动的生成对应的SQL，并调用JDBC接口来执行，所以其开发效率会高于MyBatis。然而Hibernate自身也存在着一些缺点，例如它在多表关联时，对 SQL 查询的支持较差；更新数据时，需要发送所有字段；不支持存储过程；不能通过优化 SQL 来优化性能等。这些问题导致其只适合在场景不太复杂且对性能要求不高的项目中使用。
