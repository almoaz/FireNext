## NextDatabase

NextDatabase work with 5 method 
-  NextDatabase.add()
-  NextDatabase.read()
-  NextDatabase.hasChild()
-  NextDatabase.query()
-  NextDatabase.delete()


## NextDatabase.add()
```bash
NextDatabase.add("USER>18301>name:Mahfuz Salehin|id:18301|phone:016XXXXXXXX");
```

## NextDatabase.read()
```bash
NextDatabase.read("USER>18301>name:");
```
```bash
Output: Mahfuz Salehin 

```

## NextDatabase.read()
```bash
NextDatabase.read("USER>18301");
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
NextDatabase.read("USER");
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
NextDatabase.hasChild("USER>18301>name:");
```
```bash
Output: true 

```

## NextDatabase.hasChild()
```bash
NextDatabase.hasChild("USER>18301");
```
```bash
Output: true 

```

## NextDatabase.query()
```bash
NextDatabase.query("USER>name:");
```
```bash
Output: [18301, 18302]

```

## NextDatabase.delete()
```bash
NextDatabase.delete("USER>18301>name:");
```

## NextDatabase.delete()
```bash
NextDatabase.delete("USER>18301");
```
