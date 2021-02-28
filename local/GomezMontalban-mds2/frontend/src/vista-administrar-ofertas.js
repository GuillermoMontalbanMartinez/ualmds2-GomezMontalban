import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrar-ofertas`
 *
 * VistaAdministrarOfertas element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrarOfertas extends PolymerElement {

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
        return 'vista-administrar-ofertas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarOfertas.is, VistaAdministrarOfertas);
