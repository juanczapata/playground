package com.samples.others;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VersionSorter {

	public static void main(String[] args) {
		List<String> versions = new ArrayList<>();
		versions.add("1.0.10");
		versions.add("1.2.0");
		versions.add("2.2.0");
		versions.add("2.1.50");
		versions.add("2.1.200");
		versions.add("5.2.9");
		versions.add("5.10.0");
		versions.add("3.50.0");
		versions.add("3.200.100");
		versions.add("7.0");
		versions.add("7.10");
		versions.add("7.2");
		
		List<Version> versionObjects = versions.stream().map(version -> getVersionToIterate(version)).collect(Collectors.toList());
		
		versionObjects.sort(Comparator.comparing(Version::getMajorVersion)
				.thenComparing(Version::getMinorVersion)
				.thenComparing(Version::getPatchVersion).reversed());
		
		versionObjects.stream().forEach(item -> System.out.println("item " + item.getFullVersion()));
	}

	private static Version getVersionToIterate(String version) {
		String[] splittedVersion = version.split("\\.");
		
		Version versionElement = new Version();
		versionElement.setFullVersion(version);
		versionElement.setMajorVersion(Integer.valueOf(splittedVersion[0]));
		versionElement.setMinorVersion(Integer.valueOf(splittedVersion[1]));
		
		if(splittedVersion.length > 2 && !splittedVersion[2].isEmpty()) {
			versionElement.setPatchVersion(Integer.valueOf(splittedVersion[2]));
		}
		return versionElement;
	}

}
