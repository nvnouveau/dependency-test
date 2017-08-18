package rivaltest;

import java.util.List;

public interface DependencyProgram {

		public void depend(String keys, List<String> values);

		public void install(String program);

		public void remove(String program);

		public void list();

}
