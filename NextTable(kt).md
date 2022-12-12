
## NextTable

NextTable work with 17 method 
-  NextTable.create_table()
-  NextTable.read_table()
-  NextTable.delete_table()
-  NextTable.add_col_name()
-  NextTable.read_col_name()
-  NextTable.update_col_name()
-  NextTable.delete_col_name()
-  NextTable.add_data()
-  NextTable.search_data()
-  NextTable.update_data()
-  NextTable.delete_data()
-  NextTable.search_row_data()
-  NextTable.update_row()
-  NextTable.delete_row()
-  NextTable.search_col_data()
-  NextTable.delete_col
-  NextTable.table_to_doc()


##  NextTable.create_table()
```bash
val tableName: String = "ducument"

NextTable.create_table(applicationContext, tableName)
```
```bash
Output: if table create succssfully you can find "tableName.nt" file. 
```


##  NextTable.read_table()
```bash
val tableName: String = "ducument"

NextTable.read_table(applicationContext, tableName)
```
```bash
Output: Table data.
```

##  NextTable.delete_table()
```bash
val tableName: String = "ducument"

NextTable.delete_table(applicationContext, tableName)
```

##  NextTable.add_col_name()
```bash
val tableName: String = "ducument"
val columnName: String = "id|name|phone"

NextTable.add_col_name(applicationContext, tableName, columnName)
```

##  NextTable.read_col_name()
```bash
val tableName: String = "ducument"

NextTable.read_col_name(applicationContext, tableName)

```
```bash
Output: Table column name.
```

##  NextTable.update_col_name()
```bash
val tableName: String = "ducument"
val columnName: String = "phone"
val updateColumnName: String = "email"

NextTable.update_col_name(applicationContext, tableName, columnName, updateColumnName)

```

##  NextTable.delete_col_name()
```bash
val tableName: String = "ducument"
val columnName: String = "phone"

NextTable.delete_col_name(applicationContext, tableName, columnName)
```

##  NextTable.add_data()
```bash
val tableName: String = "ducument"
val data: String = "18303|Al Moaz|016XXXXXXXX"

NextTable.add_data(applicationContext, tableName, data)
```

##  NextTable.search_data()
```bash
val tableName: String = "ducument"
val searchId: String = "18301"
val columnName: String = "phone"
NextTable.search_data(applicationContext, tableName, searchId, columnName)
```
```bash
Output: Search data.
```

##  NextTable.update_data()
```bash
val tableName: String = "ducument"
val searchId: String = "18301"
val columnName: String = "phone"
val updateData: String = "Mahfuz Salehin Moaz"

NextTable.update_data(applicationContext, tableName, searchId, columnName, updateData)
```

##  NextTable.delete_data()
```bash
val tableName: String = "ducument"
val searchId: String = "18301"
val columnName: String = "phone"

NextTable.delete_data(applicationContext, tableName, searchId, columnName)
```

##  NextTable.search_row_data()
```bash
val tableName: String = "ducument"
val searchId: String = "18301"

NextTable.search_row_data(applicationContext, tableName, searchId);
```
```bash
Output: Row data.
```

##  NextTable.update_row()
```bash
val tableName: String = "ducument"
val searchId: String = "18301"
val data: String = "18301|Al Moaz|016XXXXXXXX"

NextTable.update_row(applicationContext, tableName, searchId, data)
```

##  NextTable.delete_row()
```bash
val tableName: String = "ducument"
val searchId: String = "18301"

NextTable.delete_row(applicationContext, tableName, searchId)
```

##  NextTable.search_col_data()
```bash
val tableName: String = "ducument"
val columnName: String = "id"

NextTable.search_col_data(applicationContext, tableName, columnName)
```
```bash
Output: Column data.
```

##  NextTable.delete_col()
```bash
val tableName: String = "ducument"
val columnName: String = "phone"

NextTable.delete_col(applicationContext, tableName, columnName)
```

##  NextTable.table_to_doc()
```bash
val tableName: String = "ducument"
val columnName: String = "id"

NextTable.table_to_doc(applicationContext, tableName, columnName) 
```