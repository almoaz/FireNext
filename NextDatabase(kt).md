## NextDatabase

NextDatabase work with 5 method 
-  NextDatabase.add()
-  NextDatabase.read()
-  NextDatabase.hasChild()
-  NextDatabase.query()
-  NextDatabase.delete()


## NextDatabase.add()
```bash
NextDatabase.add(applicationContext, "USER>18301>name:Mahfuz Salehin|id:18301|phone:016XXXXXXXX")
```

## NextDatabase.read()
```bash
NextDatabase.read(applicationContext, "USER>18301>name:")
```
```bash
Output: Mahfuz Salehin 

```

## NextDatabase.read()
```bash
NextDatabase.read(applicationContext, "USER>18301")
```
```bash
Output:

18301
   |---name:Mahfuz Salehin
   |---id:18301
   |---phone:016XXXXXXXX   

```

## NextDatabase.read()
```bash
NextDatabase.read(applicationContext, "USER")
```
```bash
Output:

USER
   |---18301
   |       |---name:Mahfuz Salehin
   |       |---id:18301
   |       |---phone:016XXXXXXXX   

```

## NextDatabase.hasChild()
```bash
NextDatabase.hasChild(applicationContext, "USER>18301>name:")
```
```bash
Output: true 

```

## NextDatabase.hasChild()
```bash
NextDatabase.hasChild(applicationContext, "USER>18301")
```
```bash
Output: true 

```

## NextDatabase.query()
```bash
NextDatabase.query(applicationContext, "USER>name:")
```
```bash
Output: [18301, 18302]

```

## NextDatabase.delete()
```bash
NextDatabase.delete(applicationContext, "USER>18301>name:")
```

## NextDatabase.delete()
```bash
NextDatabase.delete(applicationContext, "USER>18301")
```
