class VehicleRunner{
	public static void main(String[] dev){
		String source="Koppal";
		String destination="Bengaluru";
		double onTime=6.5;
		Vehicle.transport(source,destination);
		Vehicle.transport(source,destination,onTime);
		Vehicle.transport(destination);
		Vehicle.transport(destination,onTime);
		Vehicle.transport(onTime);
	}
}