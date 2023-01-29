class Solution 
{
    public String categorizeBox(int length, int width, int height, int mass) 
    {
        long volume=(long)length*(long)width*(long)height;
        boolean Bulky=(length>=Math.pow(10,4) || width>=Math.pow(10,4) || height>=Math.pow(10,4) || volume>=Math.pow(10,9));
        
        boolean Heavy=(mass>=Math.pow(10,2));
        
        if(Bulky && Heavy){
            return "Both";
        }else if(!Bulky && !Heavy){
            return "Neither";
        }else if(Bulky && !Heavy){
            return "Bulky";
        }else{
            return "Heavy";
        }
    }
}



// class Solution {
//     public String categorizeBox(int l, int w, int h, int m) {
//         long vol=(long)l*(long)w*(long)h;
//         //Bulky
//         boolean bulky=((l>=Math.pow(10,4) || w >= Math.pow(10,4) || h >= Math.pow(10,4)) || vol >= Math.pow(10,9));
//         //Heavy
//         boolean heavy=(m >= 100);

//         if(bulky && heavy){
//             return "Both";
//         }
//         else if(!bulky && !heavy){
//             return "Neither";
//         }
//         else if(bulky && !heavy){
//             return "Bulky";
//         }
//         else{
//             return "Heavy";
//         }
//     }
// }


