import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-ofertas.js';
import './vista-productos-mas-vendidos.js';
import './vista-ver-publicidad.js';

class VistaCibernautaComun extends PolymerElement {
 
    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <h3>Ofertas disponibles</h3>
 <vista-ofertas style="height: 100%; width: 100%;"></vista-ofertas>
 <h3>Productos más vendidos</h3>
 <vista-productos-mas-vendidos style="width: 100%; height: 100%;"></vista-productos-mas-vendidos>
 <vista-ver-publicidad style="height: 70%; width: 100%;"></vista-ver-publicidad>
</vaadin-vertical-layout>
`;
    }
 
    static get is() {
        return 'vista-cibernauta-comun';
    }
 
    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}
 
customElements.define(VistaCibernautaComun.is, VistaCibernautaComun);


//prueba