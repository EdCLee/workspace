package sample15.dao;
import java.util.Collection;
import java.util.HashMap;
import sample15.model.Member;
public class MemberDaoImpl implements MemberDao {
	private static int nextId;
	private HashMap<String, Member> map = 
		new HashMap<String, Member>();
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
	public Collection<Member> selectAll() {
		return map.values();
	}
}