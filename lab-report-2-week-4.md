# Lab Report 2 Week 4
## First set
![image](https://github.com/vthiruvadi99/markdown-parse/blob/main/LR2-1a.png)
![image](https://github.com/vthiruvadi99/markdown-parse/blob/main/LR2-2a.png)
1. If the first line of the markdown file is a link then it returns an error because the first index is a bracket. The symptom was an error message. The bug itself was the fact that the code was looking for the next bracket so it was not not expecting the first index to be a bracket.

## Second set
![image](https://github.com/vthiruvadi99/markdown-parse/blob/main/LR2-1b.png)
![image](https://github.com/vthiruvadi99/markdown-parse/blob/main/LR2-2b.png)
1. If the input had the attributes of link such as the brackets, etc. but was not actually a link just a text. This code still returned the text which was the symptom. The bug was that code only looked for brackets to determine links. 

##Third set
![image](https://github.com/vthiruvadi99/markdown-parse/blob/main/LR2-1c.png)
![image](https://github.com/vthiruvadi99/markdown-parse/blob/main/LR2-2c.png)
1. We put an image link in this and did not want the output to return the link of the image. The symptom was either no links or both the normal and image link. The bug was because the code simply looks at the brackets and the following link. The fix was to make note of the initial exclamation point.

