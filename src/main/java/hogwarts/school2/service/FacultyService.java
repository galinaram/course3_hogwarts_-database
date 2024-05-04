package hogwarts.school2.service;

import hogwarts.school2.repositories.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hogwarts.school2.model.Faculty;

import java.util.HashMap;
import java.util.Map;
@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;
    public Faculty createFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }
    public Faculty findFaculty(long id){
        return facultyRepository.findById(id).get();
    }
    public Faculty editFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }
    public void deleteFaculty(long id){
        facultyRepository.deleteById(id);
    }
}
