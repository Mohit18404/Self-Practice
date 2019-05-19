package SmartCoin;

/*
 * @author: mohit5.kumar
 * @created: 26/03/19
 */
// Java program to find number of persons under every employee

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberEmployeeUnderManager {
    // A hashmap to store result. It stores count of employees
    // under every employee, the count may by 0 also
    static Map<String, Integer> result =
            new HashMap<String, Integer>();

    // Driver function
    public static void main(String[] args) {
        Map<String, String> dataSet = new HashMap<String, String>();
        dataSet.put("A", "C");
        dataSet.put("B", "C");
        dataSet.put("C", "F");
        dataSet.put("D", "E");
        dataSet.put("E", "F");
        dataSet.put("F", "F");

        method(dataSet);
        System.out.println("result = " + result);
    }

    private static void method(Map<String, String> data) {
        Map<String, List<String>> managerEmp = new HashMap<String, List<String>>();

        for (Map.Entry<String, String> entry : data.entrySet()) {
            String emp = entry.getKey();
            String manager = entry.getValue();
            if (!emp.equals(manager)) {
                List<String> directReportList = managerEmp.get(manager);

                if (directReportList == null)
                    directReportList = new ArrayList<String>();
                directReportList.add(emp);
                managerEmp.put(manager, directReportList);
            }
        }
        for (String manager : data.keySet()){
            methodUtil(manager,managerEmp);
        }
    }
    private static int methodUtil(String manager, Map<String, List<String>> managerEmp) {
        int count = 0;
        if (!managerEmp.containsKey(manager)) {
            result.put(manager, 0);
            return 0;
        }
        else if (result.containsKey(manager))
            count = result.get(manager);

        else {
            List<String> directReportEmpList = managerEmp.get(manager);
            count = directReportEmpList.size();
            for (String directReportEmp : directReportEmpList)
                count += methodUtil(directReportEmp, managerEmp);

            result.put(manager, count);
        }
        return count;
    }
}

