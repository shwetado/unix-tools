Unix Tools
====================
This repository simulates the unix-tools like `wc, cut, head, tail, sort, uniq` and also one extra functionality that is `reduceSpaces`.

#### How do you install?:
* Download the `.jar` and `.sh` files.
* You just need to run the `sh setPath.sh` command.
    It will set environment variable for you.
* Then you can just run the shell files.
* For example if you want to run wc then
    `sh sd_wc.sh $filename`.


##### wc :
* Short for word count, wc displays a count of lines, words, and characters in a file.

```
sd_wc.sh filename.txt
```

##### cut :
* Removes or "cut out" sections of each line of a file.

```
sd_cut.sh filename.txt -fieldNo [delimiter]
```

##### head:
* Head makes it easy to output the first part of file contains first `n` lines.

```
sd_head.sh filename.txt
```
OR

```
sd_head.sh -noOfLines filename.txt
```

##### tail:
* Delivers the last part of the file contains last `n` lines.

```
sd_tail.sh filename.txt
```
OR

```
sd_tail.sh -noOfLines filename.txt
```

##### sort:
* Sorts the lines in a file and gives you both sorted data in original and reverse order.

```
sd_sort.sh filename.txt
```

##### uniq:
* Report or filter out repeated lines in a file.

```
sd_uniq.sh filename.txt
```

##### reduceSpaces:
* Reduces more than one occurence of blank spaces into 1.

```
sd_reduceSpaces.sh filename.txt
```
