/**
* Returns a list of all the numbers from 1 to 100 and these numbers are divisible by num
*e.g. num = 20, return [20,40,60,80,100]
*@param num the number to get the multiples of
*@return A list of all of the multiples of num within 100
*/
public int[] getMultiples(int num) {

ArrayList<Number> temp = new ArrayList<Number>();

//check to see if number is divisible by num
for(int i = 1; i<= 100; i++) {
    if(i % num == 0) {
        //adding to the index
        temp.add(i);
    }
}
//increase the size of the temporary array by 1 and add item
int [] final = new int[temp.size()];

for(int i = 0; i < items.size(); i++) {
    final[i] = temp.get(i);
}
return final;
}


