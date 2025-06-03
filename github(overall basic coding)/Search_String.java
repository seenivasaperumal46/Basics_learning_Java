public class Search_String {
    public static void main(String[] args) {
        String str ="seeni";
        char target ='e';

        System.out.println(Search(str,target));
        System.out.println(Search2(str,target));
    }
    static boolean Search2(String str,char target ){
        if(str.length()==0){
            return false;
        }
        //enhanced for loop;
       for(char ch:str.toCharArray()){
           if(target == ch){
               return true;
           }
       }
        return false;
    }
    //using normal for to find the value at which index.
    static boolean Search(String str,char target ){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target ==str.charAt(i)){
                return true;
            }
        }
        return false;
    }


}
