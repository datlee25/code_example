package huuphu.aprotrain.app_exam;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface EmployeeDao {
    @Insert(onConflict = REPLACE)
    long insert(Employee employee);
    @Update
    int update(Employee user);
    @Delete
    int delete(Employee user);
    @Query("SELECT * FROM employee")
    List<Employee> getAll();
    @Query("SELECT * FROM employee WHERE id = :id")
    Employee findById(int id);
}
