import java.util.ArrayList;
import java.util.List;

public class Employee {

    private List<Role> roles;    
    private String name;
    private String department;


    
    
    public Employee(String name, String department, Role initialRole){
        
        this.name = name;
        this.department = department;
        roles = new ArrayList<>();
        roles.add(initialRole);
    }

    public void addRole(Role role)
    {
        roles.add(role);
    }

    public List<Role> getRoles() {
        return roles;
    }


    public String getName() {
        return name;
    }


    public String getDepartment() {
        return department;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Name: ");
        builder.append(this.name);
        builder.append(",\nDepartment: ");
        builder.append(department);
        builder.append(",\nRoles: ");
        for(Role role : roles)
        {
            builder.append(role);
            builder.append(", ");
        }
        builder.delete(builder.length()-2, builder.length());


        return builder.toString();
    }
}
