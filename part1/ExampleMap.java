import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      List<String> overEnrolledStudents = new LinkedList<>();

      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */

      int UnitTotal = 0;

         for (Map.Entry<String, List<Course>> it : courseListsByStudentName.entrySet())
         {
               UnitTotal = 0;
            for (Course c : it.getValue())
            {
               UnitTotal += c.getNumUnits();
            }
               if(UnitTotal > unitThreshold)
               {    
                  overEnrolledStudents.add(it.getKey());
               }

        }

      return overEnrolledStudents;      
   }
}
