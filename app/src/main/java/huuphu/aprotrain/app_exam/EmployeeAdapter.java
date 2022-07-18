package huuphu.aprotrain.app_exam;

import android.app.Activity;
        import android.content.Context;
        import android.content.Intent;
import android.util.Log;
import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter {

    private final Activity activity;
    private final List<Employee> employeeList;

    public EmployeeAdapter(Activity activity, List<Employee> employeeList) {
        this.activity = activity;
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(R.layout.item_list,parent,false);
        EmployeeHoder employeeHoder = new EmployeeHoder(view);
        return employeeHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EmployeeHoder employeeHoder = (EmployeeHoder) holder;
        Employee model = employeeList.get(position);
        employeeHoder.tvName.setText(model.name);
        employeeHoder.tvDesignation.setText(model.designation);
        employeeHoder.tvSalary.setText(""+ model.salary);
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class EmployeeHoder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvDesignation;
        TextView tvSalary;

        public EmployeeHoder (@NonNull View interview){
            super(interview);
            tvName = interview.findViewById(R.id.item_name);
            tvDesignation = interview.findViewById(R.id.item_designation);
            tvSalary = interview.findViewById(R.id.item_salary);
        }


    }
}
