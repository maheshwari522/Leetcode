/**
 * @param {string} version1
 * @param {string} version2
 * @return {number}
 */
var compareVersion = function(version1, version2) {
;
    const partsa = version1.split('.').map(Number);
    const partsb = version2.split('.').map(Number);

    let n = Math.max(partsa.length,partsb.length);

    for(let i = 0;i<n;i++){
      const a = partsa[i] || 0;
      const b = partsb[i] || 0;
      if(a>b){
        return 1;
      }else if(a<b){
        return -1;
      }
    }

    return 0;
    
};