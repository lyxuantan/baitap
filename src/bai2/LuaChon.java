package bai2;

public enum LuaChon {
	LUA_CHON_MOT(1), LUA_CHON_HAI(2), LUA_CHON_BA(3), LUA_CHON_BON(4), LUA_CHON_NAM(5);

	Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	LuaChon(int i) {

	}
}
