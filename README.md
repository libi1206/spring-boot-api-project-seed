## 简介
Spring Boot API Project Seed 是一个基于Spring Boot & MyBatis的种子项目，用于快速构建中小型API、RESTful API项目，稳定、简单、快速，使我们摆脱那些重复劳动，专注于业务代码的编写，减少加班。下面是一个快速上手步骤



## 如何使用

### 1. MyBatis Generator生成Mapper代码

* generator的配置文件：`sqlmap/auto/StudentExampleBeanMapper.xml`，修改其中的数据库信息和需要更改的表信息就好
* generator会生成mapper.xml文件、mapper接口和Bean类（Pojo类），会放在起名为auto的文件夹/包下，我已经放入了用于演示的文件

### 2. swagger

项目集成了swagger，使用时只需要修改`com.company.project.configurer.Swagger2`类，并且参照实例controller中的用法即可生成接口文档



### 3. 常量

* 全局的常量字符串可以放到`.core.constent.ProjectConstant`类中，全局的返回之后状态码可以放到`.core.constent.Code`类中
* 所有的service都会返回一个基础的响应结构`.core.response.BaseResult`，使用`.core.response.BaseResultFactory`类中的方法传入`Code`对象和承载返回数据的POJO就可以快速打造规范化的响应



### 4. 异常抛出

* 本系统拥有异常处理器：`.core.exception.GlobalExceptionHandlerAdvice`,在任何地方都可以抛出异常，异常都会被异常处理器捕获并且抛出`BaseResult`
* 有标准的业务异常类`.core.exception.BusinessException`，推荐继承这些类，然后在异常处理器中分开处理