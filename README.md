# mybatis
* 官網：https://blog.mybatis.org/

* Mybatis Plus: https://github.com/S-kwen/mybatis-plus

### 什麼是Mybatis？
MyBatis是一款優秀的基於java的持久層框架，它內部封裝了jdbc，使開發者只需要關註sql語句本身，而不需要花費精力去處理加載驅動、創建連接、創建statement等繁雜的過程
### 什麽是持久化框架？
* 首先我們需要知道什麽是持久化？

    持久化是將程序數據在持久狀態和瞬時狀態間轉換的機制。通俗的講，就是瞬時數據（比如內存中的數據，是不能永久保存的）持久化為持久數據（比如持久化至數據庫中，能夠長久保存）。
* 那什麽是持久化框架呢？

    那就簡單多了，就是一個用於管理那些持久化數據的框架，例如傳統的JDBC或是當今流行的Mybatis、MybatisPlus和Hibernate
### Mybatis和 Hibernate有什麽區別？
* MyBatis：

    是一個半自動映射的框架。這裏所謂的“半自動”是相對於Hibernate全表映射而言的，MyBatis 需要手動匹配提供 POJO、SQL和映射關系，而Hibernate只需提供POJO 和映射關系即可。與Hibernate相比，雖然使用MyBatis手動編寫 SQL 要比使用Hibernate的工作量大，但MyBatis可以配置動態SQL並優化SQL，可以通過配置決定SQL的映射規則，它還支持存儲過程等。對於一些復雜的和需要優化性能的項目來說，顯然使用MyBatis更加合適。

* Hibernate

    是一個全表映射的框架。通常開發者只需定義好持久化對象到數據庫表的映射關系，就可以通過 Hibernate 提供的方法完成持久層操作。開發者並不需要熟練地掌握 SQL語句的編寫，Hibernate會根據制定的存儲邏輯，自動的生成對應的SQL，並調用JDBC接口來執行，所以其開發效率會高於MyBatis。然而Hibernate自身也存在著一些缺點，例如它在多表關聯時，對 SQL 查詢的支持較差；更新數據時，需要發送所有字段；不支持存儲過程；不能通過優化 SQL 來優化性能等。這些問題導致其只適合在場景不太復雜且對性能要求不高的項目中使用。

## Contact Author
石桂華(Skwen) https://blog.iskwen.com
# END
* Thank you for watching.
