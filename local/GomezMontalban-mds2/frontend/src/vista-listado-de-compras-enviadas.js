import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-listado-de-compras-enviadas`
 *
 * VistaListadoDeComprasEnviadas element.
 *
 * @customElement
 * @polymer
 */
class VistaListadoDeComprasEnviadas extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-listado-de-compras-enviadas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoDeComprasEnviadas.is, VistaListadoDeComprasEnviadas);
