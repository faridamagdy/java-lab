public class Main {
    public static void main(String[] args) {
        String line="please,enter,your, grades,and , also ,what,courses, did , you ,take,";
        //this loop to move on every char or word in the sentence
        for(int i=0;i<line.length();i++)
        {
            char ch=line.charAt(i);
            if(ch==',')
                // replaceAll this the function that replace every comma with tap
                line=line.replaceAll(",", " ");
        }
        //print the sentence after remove commas
        System.out.println (line);

    }

}

