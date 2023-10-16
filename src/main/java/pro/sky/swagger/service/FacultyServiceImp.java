package pro.sky.swagger.service;

import org.springframework.stereotype.Service;
import pro.sky.swagger.model.Faculty;


import java.util.HashMap;

@Service
public  class FacultyServiceImp implements FacultyService {

    private final HashMap<Long, Faculty> faculties = new HashMap<>();
    private long count = 0;

    public Faculty addFaculty(Faculty faculty) {
        faculty.setId(count++);
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty findFaculty(long id) {
        return faculties.get(id);
    }

    public Faculty editFaculty(long id ,Faculty faculty) {
        if (!faculties.containsKey(faculty.getId())) {
            return null;
        }
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public void deleteFaculty(long id) {
        faculties.remove(id);
    }
}
