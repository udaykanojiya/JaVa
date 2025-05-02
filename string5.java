public class string5 {
    public static void main(String[] args) {
//         String str="hellooo";
//         String str2="";
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//             if(str2.indexOf(c)!==-1){
//                 str2+=c;
                
//             }
           
//         }
//      System.out.println(str2);
//     }
// }


String str="hellEE";
char[] ch=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
for(int j=i+1;j<ch.length;j++) 
{
if(ch[i]==ch[j])
{
System.out.println(ch[i]);
    break;
    }
}
}
}
}
