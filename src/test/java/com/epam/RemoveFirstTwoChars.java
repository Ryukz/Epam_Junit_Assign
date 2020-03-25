package com.epam;

public class RemoveFirstTwoChars {
    public String remove(String s)
    {
        char A[]=s.toCharArray();
        if(A.length>2)
        {
            if(A[0]=='A' && A[1]=='A')
                return s.substring(2,A.length);
            else {
                if (A[0] == 'A' && A[1]!='A')
                    return  s.substring(1);
                if (A[1] == 'A' && A[0]!='A')
                    return s.substring(0,1)+s.substring(2);
            }
                if(A[0]!='A' && A[1]!='A')
               return s;

        }
        else
            if(A.length<=2 && s.contains("A"))
                return s.replace("A","");

                return s;

    }
}
