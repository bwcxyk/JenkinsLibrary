package org.devops


//镜像仓库
def Repository(login){
    
    if ("${registry}" == "local"){
        sh  """
        docker login --username=admin 192.168.0.2 --password=Yuanfu1211
        """
    } else if ("${registry}" == "aliyun"){
        sh  """
        docker login --username=admin registry.cn-shanghai.aliyuncs.com --password=Yuanfu1211
        """
    } else {
        sh  """
        docker login --username=cn-east-2@VMKGNWR86FUNMDMKNPKJ --password=eefd5bebe0e349a5ed2ffb22bf0a488ec8dba5d2a3075272f8f0d79e0f09616e swr.cn-east-2.myhuaweicloud.com
        """
    }

}